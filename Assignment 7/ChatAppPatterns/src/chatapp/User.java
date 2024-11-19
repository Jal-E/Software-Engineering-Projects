package chatapp;

import java.util.Set;

public class User {
    private final String username;
    private final ChatServer chatServer;
    private final ChatHistory chatHistory = new ChatHistory();
    private MessageMemento lastMessage;

    public User(String username, ChatServer chatServer) {
        this.username = username;
        this.chatServer = chatServer;
        chatServer.registerUser(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(Set<String> recipients, String content) {
        // Remove invalid recipients
        recipients.removeIf(recipient -> !chatServer.isUserRegistered(recipient));

        if (recipients.isEmpty()) {
            System.out.println("No valid recipients to send the message.");
            return; // Stop execution if no valid recipients exist
        }

        // Create and send the message
        Message message = new Message(username, content);
        chatServer.sendMessage(message, recipients);

        // Add message to chat history and store a memento
        chatHistory.addMessage(message);
        lastMessage = new MessageMemento(content, message.getTimestamp());
    }

    public void undoLastMessage() {
        if (lastMessage != null) {
            // Remove the last message from chat history
            Message lastSentMessage = chatHistory.getLastMessage();
            if (lastSentMessage != null && lastSentMessage.getSender().equals(username)) {
                chatHistory.getMessages().remove(lastSentMessage);
            }
            System.out.println(username + " undid message: " + lastMessage.getContent());
            lastMessage = null; // Clear the memento
        } else {
            System.out.println(username + " has no messages to undo.");
        }
    }

    public void receiveMessage(Message message) {
        chatHistory.addMessage(message);
        System.out.println(username + " received: " + message);
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }
}

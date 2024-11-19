package chatapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("Max", chatServer);
        User user2 = new User("TanTan", chatServer);
        User user3 = new User("Anna", chatServer);

        // Sending messages
        user1.sendMessage(new HashSet<>(Arrays.asList("TanTan", "Anna")), "Hello everyone!");
        user2.sendMessage(new HashSet<>(Arrays.asList("Max")), "Hi Max!");
        user3.sendMessage(new HashSet<>(Arrays.asList("Max", "TanTan")), "Hi Max and TanTan!");

        // Blocking a user
        chatServer.blockUser("Anna", "Max");
        user1.sendMessage(new HashSet<>(Arrays.asList("Anna")), "Blocked message!");

        // Undo last message
        user1.undoLastMessage();

        // Iterating over chat history for messages with TanTan
        System.out.println("\nIterating over Max's chat history with TanTan:");
        Iterator<Message> iterator = user1.getChatHistory().iterator(user2);
        while (iterator.hasNext()) {
            Message message = iterator.next();
            System.out.println(message);
        }
    }
}

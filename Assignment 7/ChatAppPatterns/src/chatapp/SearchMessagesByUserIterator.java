package chatapp;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SearchMessagesByUserIterator implements Iterator<Message> {
    private final List<Message> messages;
    private final User userToSearchWith;
    private int currentIndex = 0;

    public SearchMessagesByUserIterator(List<Message> messages, User userToSearchWith) {
        this.messages = messages;
        this.userToSearchWith = userToSearchWith;
    }

    @Override
    public boolean hasNext() {
        // Ensure we skip to the next relevant message
        while (currentIndex < messages.size()) {
            Message message = messages.get(currentIndex);
            // Check if the message sender matches the userToSearchWith
            if (message.getSender().equals(userToSearchWith.getUsername())) {
                return true;
            }
            currentIndex++; // Skip irrelevant messages
        }
        return false; // No more relevant messages
    }

    @Override
    public Message next() {
        // Ensure the next call is valid
        if (!hasNext()) {
            throw new NoSuchElementException("No more messages from the specified user.");
        }
        return messages.get(currentIndex++);
    }
}

package chatapp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatServer {
    private final Map<String, User> registeredUsers = new HashMap<>();
    private final Map<String, Set<String>> blockedUsers = new HashMap<>();

    // Register a user
    public void registerUser(User user) {
        if (!registeredUsers.containsKey(user.getUsername())) {
            registeredUsers.put(user.getUsername(), user);
            blockedUsers.put(user.getUsername(), new HashSet<>());
        }
    }

    // Send a message to multiple recipients
    public void sendMessage(Message message, Set<String> recipients) {
        for (String recipient : recipients) {
            if (registeredUsers.containsKey(recipient) &&
                    !blockedUsers.get(recipient).contains(message.getSender())) {
                registeredUsers.get(recipient).receiveMessage(message);
            }
        }
    }

    // Block a user
    public void blockUser(String blocker, String blockee) {
        if (blockedUsers.containsKey(blocker)) {
            blockedUsers.get(blocker).add(blockee);
        }
    }

    // Helper to check if a user is registered
    public boolean isUserRegistered(String username) {
        return registeredUsers.containsKey(username);
    }
}

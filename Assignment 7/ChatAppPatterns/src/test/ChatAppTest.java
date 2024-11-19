package chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ChatAppTest {

    @Test
    public void testChatAppFeatures() {
        // Initialize ChatServer
        ChatServer chatServer = new ChatServer();

        // Create users
        User max = new User("Max", chatServer);
        User tantan = new User("TanTan", chatServer);
        User anna = new User("Anna", chatServer);

        // Test 1: Sending Messages
        max.sendMessage(new HashSet<>(Arrays.asList("TanTan", "Anna")), "Hello everyone!");
        tantan.sendMessage(new HashSet<>(Arrays.asList("Max")), "Hi Max!");
        anna.sendMessage(new HashSet<>(Arrays.asList("Max", "TanTan")), "Hi Max and TanTan!");

        // Verify messages were sent and received correctly
        assertEquals(3, tantan.getChatHistory().getMessages().size());
        assertEquals(2, anna.getChatHistory().getMessages().size());
        assertEquals(3, max.getChatHistory().getMessages().size());

        // Verify specific messages in chat histories
        assertEquals("Hello everyone!", tantan.getChatHistory().getMessages().get(0).getContent());
        assertEquals("Hi Max and TanTan!", anna.getChatHistory().getMessages().get(1).getContent());

        // Test 2: Blocking Users
        chatServer.blockUser("Anna", "Max"); // Anna blocks Max
        max.sendMessage(new HashSet<>(Arrays.asList("Anna")), "Blocked message!");

        // Verify blocked message wasn't received
        assertNotEquals("Blocked message!", anna.getChatHistory().getLastMessage().getContent());

        // Test 3: Undo Last Message
        max.undoLastMessage();

        // Verify undo message functionality
        assertNull(max.getChatHistory().getMessages()
                .stream()
                .filter(msg -> "Blocked message!".equals(msg.getContent()))
                .findAny()
                .orElse(null));

        // Test 4: Iterating Over Chat History by User
        System.out.println("\nIterating over Max's chat history with TanTan:");
        Iterator<Message> iterator = max.getChatHistory().iterator(tantan);
        while (iterator.hasNext()) {
            Message message = iterator.next();
            System.out.println(message);
        }

        // Verify iterator functionality
        assertEquals("Hi Max!", max.getChatHistory().iterator(tantan).next().getContent());
    }
}

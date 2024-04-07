package co.pgmjsd.ex01;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public DirectMessage whateverResponse(DirectMessage message) throws Exception {
        // here you can process your message, save it, etc.
        // ...
        // return this message (or any other object) back to the client 
        return message;
    }
}
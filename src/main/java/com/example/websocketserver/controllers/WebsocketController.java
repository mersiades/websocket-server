package com.example.websocketserver.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebsocketController {

    @MessageMapping("/test")
    @SendTo("/topic/test")
    public String sendTestMessage() {
        return "return message";
    }
}

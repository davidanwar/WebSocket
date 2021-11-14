package com.agripedia.websocket;

import com.agripedia.websocket.dto.Message;
import com.agripedia.websocket.dto.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;

@Controller
public class MessageController {

    @MessageMapping("/message")
//    @SendTo("/topic/messages")
    public ResponseMessage getMessage(final Message message) throws InterruptedException {
        Thread.sleep(1000);
        return new ResponseMessage(HtmlUtils.htmlEscape(message.getContentMessage()));
    }

    @MessageMapping("/private-message")
//    @SendToUser("/topic/private-messages")
    public ResponseMessage getPrivateMessage(final Message message, Principal principal) throws InterruptedException {
        Thread.sleep(1000);
        return new ResponseMessage(HtmlUtils.htmlEscape(
                "Sending private message to user : "
                        + principal.getName()
                        + message.getContentMessage())
        );
    }

}

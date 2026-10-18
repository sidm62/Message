package org.example;

public class ContactHandler extends FeedbackHandler {




    @Override
    public boolean canhandler(Message message) {
        return message.getType() == MessageType.Contact;
    }

    @Override
    public void processMessage(Message message) {
        System.out.println("Processing contact message: " + message.getContent());
    }
}

package org.example;

public class GeneralFeedbackHandler extends FeedbackHandler {


    @Override
    public boolean canhandler(Message message) {
        return message.getType() == MessageType.General;
    }




    @Override
    public void processMessage(Message message) {
        System.out.println("Processing general feedback message: " + message.getContent());
        System.out.println("Feedback analyzed successfully.");
        System.out.println("Response: Thank you for your feedback!");
    }
}

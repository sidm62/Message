package org.example;

public class DevelopmentHandler extends FeedbackHandler {


    @Override
    public boolean canhandler(Message message) {
        return message.getType() == MessageType.Development;
    }



    @Override
    public void processMessage(Message message) {
            System.out.println("Processing development message: "
            + message.getContent());

    System.out.println("Suggestion logged successfully.");

    if (message.getContent().toLowerCase().contains("urgent")) {
        System.out.println("Priority: HIGH");
    } else {
        System.out.println("Priority: NORMAL");
    }
}
}

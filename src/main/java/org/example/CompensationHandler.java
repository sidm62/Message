package org.example;



public class CompensationHandler extends FeedbackHandler {


    @Override
    public boolean canhandler(Message message) {
        return message.getType() == MessageType.Compensation;
    }

    @Override
    public void processMessage(Message message) {
        System.out.println("Processing compensation message: "
                + message.getContent());

        if (message.getContent().toLowerCase().contains("approved")) {
            System.out.println("Result: Compensation approved.");
            System.out.println("Forwarded to customer service department.");
        } else {
            System.out.println("Result: Compensation rejected.");
        }
}
}




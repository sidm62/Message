package org.example;

public class Main {
    public static void main(String[] args) {
        FeedbackHandler compensation = new CompensationHandler();
        FeedbackHandler contact = new ContactHandler();
        FeedbackHandler development = new DevelopmentHandler();
        FeedbackHandler general = new GeneralFeedbackHandler();

        compensation
                .setNext(contact)
                .setNext(development)
                .setNext(general);


        Message message1 = new Message(
                MessageType.Compensation,
                "My compensation request is approved.",
                "customer1@example.com"
        );
        Message message2 = new Message(
                MessageType.Contact,
                "I would like to speak with customer service.",
                "customer2@example.com"
        );
        Message message3 = new Message(
                MessageType.Development,
                "Urgent: Please add a dark mode feature.",
                "customer3@example.com"
        );
        Message message4 = new Message(
                MessageType.General,
                "I am happy with your service.",
                "customer4@example.com"
        );

        // Process the messages
        compensation.handle(message1);
        compensation.handle(message2);
        compensation.handle(message3);
        compensation.handle(message4);
    }
}
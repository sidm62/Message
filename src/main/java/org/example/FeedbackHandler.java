package org.example;

public abstract class FeedbackHandler {
    private FeedbackHandler nexthandler;

    public FeedbackHandler setNext(FeedbackHandler handler) {
        this.nexthandler = handler;
        return handler;
    }
    public  void handle(Message message) {
        if (canhandler(message)) {
            processMessage(message);
        } else if (nexthandler != null) {
            nexthandler.handle(message);
        } else {
            System.out.println("No handler available for message type: " + message.getType());
        }
    }
    public abstract boolean canhandler(Message message);


    public abstract void processMessage(Message message);
}

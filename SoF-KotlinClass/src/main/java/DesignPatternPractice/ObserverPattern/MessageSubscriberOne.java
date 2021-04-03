package DesignPatternPractice.ObserverPattern;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Message Subscriber One : "+m.getMessageContent());
    }
}

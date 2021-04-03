package DesignPatternPractice.ObserverPattern;

public class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("Message Subscriber Three : "+m.getMessageContent());
    }
}

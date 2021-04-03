package DesignPatternPractice.ObserverPattern;

public class Main {
    public static void main(String args[]) {
        MessageSubscriberOne messageSubscriberOne=new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo=new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree=new MessageSubscriberThree();

        MessagePublisher messagePublisher1=new MessagePublisher();

        messagePublisher1.attach(messageSubscriberOne);
        messagePublisher1.attach(messageSubscriberTwo);

        Message m=new Message();
        m.setMessageContent("Message 1");

        messagePublisher1.notifyUpdate(m);

        messagePublisher1.detach(messageSubscriberTwo);
        messagePublisher1.attach(messageSubscriberThree);

        m.setMessageContent("Message 2");

        messagePublisher1.notifyUpdate(m);
    }
}

package work;

import threads.MyConsumer;
import threads.MyProducer;

public class Main {
    public static void main(String[] args) {
        Thread producer = new Thread(new MyProducer());
        Thread consumerOne = new Thread(new MyConsumer("Rick"));
        Thread consumerTwo = new Thread(new MyConsumer("Carl"));
        Thread consumerThree = new Thread(new MyConsumer("Daryl"));
        Thread consumerFour = new Thread(new MyConsumer("Glenn"));
        Thread consumerFive = new Thread(new MyConsumer("Dustin"));
        Thread consumerSix = new Thread(new MyConsumer("Mike"));

        producer.start();
        consumerOne.start();
        consumerTwo.start();
        consumerThree.start();
        consumerFour.start();
        consumerFive.start();
        consumerSix.start();
    }
}

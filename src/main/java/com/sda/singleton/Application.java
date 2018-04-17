package com.sda.singleton;

public class Application {
    public static void main(String[] args) {
        MyQueue myQueue = MyQueue.instanceOf();
        myQueue.push("first");
        myQueue.push("second");
        myQueue.push("third");
        Consumer consumer = new Consumer(myQueue);
        consumer.consume();
    }
}

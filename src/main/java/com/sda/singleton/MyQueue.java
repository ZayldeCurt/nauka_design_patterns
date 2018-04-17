package com.sda.singleton;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    //singleton
        //prywatny konstruktor
        //prywatne statyczne pole z instancja klasy
        //publiczna metoda zwracajaca statyczne pole z instancja

    //static zainicjalizuje tylko raz instance
    private static MyQueue instance;
    public static MyQueue instanceOf(){
        if(instance==null) instance= new MyQueue(); //zapewnia że stworzy instancje dopiero gdy pierwszy raz bedziemy chcieli uzyc tego
        return instance;
    }

    private Queue<String> myQueue;

    //konstruktor typu private
    private MyQueue() {
        this.myQueue = new LinkedList<>();
    }

    public void push(String value){
        myQueue.add(value);
    }
    public String pop(){
        return myQueue.poll();
    }
}

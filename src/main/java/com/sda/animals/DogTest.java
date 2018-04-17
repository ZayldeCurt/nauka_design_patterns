package com.sda.animals;

import com.sda.animals.dog.Dog;
import com.sda.animals.dog.DogFactory;

public class DogTest {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();

        Dog small = dogFactory.create("small");
        small.fetch();


    }
}

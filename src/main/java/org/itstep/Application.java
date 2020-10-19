package org.itstep;

import org.itstep.zoo.Animal;
import org.itstep.zoo.Wolf;

public class Application {
    public static void main(String[] args) {
        System.out.println("Zoo app");
        Animal dog = new Wolf("Bobik", 5, 20, 1, 1);
        System.out.println(dog);
        System.out.println(dog.getNickname());
        dog.setNickname("Mashka");
        System.out.println(dog);
    }

}

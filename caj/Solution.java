package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat("Tom", 4,22);
        Mouse perryMouse = new Mouse("Perry", 8,4);
        Dog guardDog = new Dog("Steve","Killer", 5);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name , poroda;
        int age;

        public Dog(String name, String poroda, int age){
            this.name = name;
            this.poroda = poroda;
            this.age = age;
        }
    }
    public  static  class Cat{
        String name;
        int age , tailLong;

        public Cat(String name, int age, int tailLong){
            this.name = name;
            this.age = age;
            this.tailLong = tailLong;
        }
    }

}

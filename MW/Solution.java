package com.javarush.task.task05.task0526;

/* 

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Seva", 26, "Morroc");
        Man man2 = new Man("Petya" , 27,"Payon");
        Woman wom1 = new Woman("Sveta", 24, "Goryn");
        Woman wim2 = new Woman("Gusya", 22, "Loyang");

        System.out.println(man1.name + " " + man1.age +" "+ man1.address);
        System.out.println(man2.name + " " + man2.age +" "+ man2.address);

        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wim2.name + " " + wim2.age + " " + wim2.address);



    }

    public static class Man{
        private  String name, address;
        private int age;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(String name){
            this(name, 22, "home");
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    public static  class  Woman{
        private String name, address;
        private int age;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(String name, int age){
            this(name,age,"work");
        }
        public void setAddress(String address){
            this.address = address;
        }
        public String getAddress(){
            return address;
        }
    }
}

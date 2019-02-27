package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String unclVasa = reader.readLine();
        Cat catUncVasa = new Cat(unclVasa);

        String gmaMurka = reader.readLine();
        Cat catOldMUrka = new Cat(gmaMurka);

        String dadKotofey = reader.readLine();
        Cat catDadKotofey = new Cat(dadKotofey, null, catUncVasa);

        String momVAsilisa = reader.readLine();
        Cat catMomVAsilisa = new Cat(momVAsilisa, catOldMUrka, null);

        String sunMur4ik = reader.readLine();
        Cat catSunMur4ik = new Cat(sunMur4ik, catMomVAsilisa, catDadKotofey);

        String douPusha = reader.readLine();
        Cat catDouPusha = new Cat(douPusha, catMomVAsilisa, catDadKotofey);

        System.out.println(catUncVasa);
        System.out.println(catOldMUrka);
        System.out.println(catDadKotofey);
        System.out.println(catMomVAsilisa);
        System.out.println(catSunMur4ik);
        System.out.println(catDouPusha);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = null;
        }
        Cat(String name, Cat parentMother, Cat parentFather){
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }


        @Override
        public String toString() {
            if (parentMother == null && parentFather == null)
                return "The cat's name is " + name + ", no mother, no father";
            if(parentFather == null)
                return  "The cat's name is " + name + ", mother is " + parentMother.name + " no father";
            if (parentMother == null)
                return "The cat's name is " + name + ", no mother,  father is " + parentFather.name;
            else
                return "The cat's name is " + name + ", mother is " + parentMother.name +
                        ",  father is " + parentFather.name;
        }
    }

}

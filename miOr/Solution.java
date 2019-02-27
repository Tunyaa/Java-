package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>str = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            str.add(i,reader.readLine());
        }
        String max = str.get(0);
        for (int i = 0; i < str.size(); i++) {
            if (max.length()<str.get(i).length()){
                max = str.get(i);
            }
        }
        String min = str.get(0);
        for (int i = 0; i < str.size(); i++) {
            if(min.length()>str.get(i).length()){
                min = str.get(i);
            }
        }
        for (int i = 0; i < str.size(); i++) {
            if(str.get(i).length()==max.length()){
                System.out.println(str.get(i));
                return;
            }
            if (str.get(i).length()==min.length()){
                System.out.println(str.get(i));
                return;
            }
        }
    }
}

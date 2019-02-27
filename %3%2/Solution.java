package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> nums = new    ArrayList<Integer>();
            ArrayList<Integer> na3 = new ArrayList<Integer>();
            ArrayList<Integer> na2 = new ArrayList<Integer>();
            ArrayList<Integer> ostalnie = new ArrayList<Integer>();
            
            for(int i = 0; i < 20; i++){
                nums.add(i,Integer.parseInt(reader.readLine()));
                if(nums.get(i)%3==0)na3.add(nums.get(i));
                if(nums.get(i)%2==0)na2.add(nums.get(i));
                if(nums.get(i)%3!=0 && nums.get(i)%2!=0) ostalnie.add(nums.get(i));
            }
            printList(na3);
            printList(na2);
            printList(ostalnie);
    }

    public static void printList(List<Integer> list) {
        for(Integer x : list){
            System.out.println(x);
        }
    }
}

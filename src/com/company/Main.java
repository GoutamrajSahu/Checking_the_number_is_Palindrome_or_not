package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the number to check Armstrong: ");
        int num = Sc.nextInt();
        int temp = num;
        int res = 0;
        while(temp>0){
            int rem = temp % 10;
            res = res * 10 + rem;
            temp = temp / 10;
        }
        if(res == num){
            System.out.println("Is Palindrome.");
        }else{
            System.out.println("Is not Palindrome");
        }
    }
}
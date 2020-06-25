package com.company.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter some number: ");
        Scanner numb = new Scanner(System.in);
        int count = numb.nextInt();
        for (int i = 0; i < count; i++) {
           for (int j = 0; j < i; j++) {
            System.out.println("*");
            }
            System.out.println("*");
       }
   }
}

package com.company;

import java.util.Scanner;

public class OOP {
    static int n;
    static int result;

    public static void main(String[] args) {
        input();
        calc();
        print();
    }


    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
         n = scanner.nextInt();

    }

    static void calc(){
         result = n*2;

    }
    static void print(){
        System.out.println("Answer: " + result);
    }
}

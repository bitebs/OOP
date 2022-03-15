package com.company;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //функциональный
        int n = input();
        int result = calc(n);
        print(result);

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();

         */




    }

    static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();
        return n;
    }

    static int calc(int n){
        int doubleNum = n*2;
        return doubleNum;
    }
    static void print(int n){
        System.out.println("Answer: " + n);
    }
}

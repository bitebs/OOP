package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //императивное
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();

        int doubleNum = n*2;

        System.out.println("Answer: " + doubleNum);
    }
}

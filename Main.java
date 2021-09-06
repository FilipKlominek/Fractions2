package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();

        float quotient;
        float total = 0;

        for (int i = 1; i <= input; i++) {
            quotient = 1f / i;
            total += quotient;
            System.out.println("1/" + i + " => " + quotient);
        }
        System.out.println("Total => " + total);
    }
}

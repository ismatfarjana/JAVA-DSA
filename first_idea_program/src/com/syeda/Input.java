package com.syeda;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll number is " + rollno);
    }
}

package com.cod3r.Exercise;

import java.util.Scanner;

public class MultiEntry {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + number);

    }
}

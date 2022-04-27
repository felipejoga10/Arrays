package com.cod3r.ArraysNdCollections;

import java.util.Arrays;
import java.util.Scanner;

public class UserGrades {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("How many grades?? ");
        int manyGrades = entry.nextInt();
        double[] grades = new double[manyGrades];

        for (int i = 0; i < grades.length; i++){
            System.out.println("Please input the next grade " + (i + 1) + ": ");
            grades[i] = entry.nextDouble();
        }
        double sum = 0;
        for(double grade: grades) {
            sum += grade;
        }

        System.out.println("Your grades are: " + Arrays.toString(grades));
        System.out.println("Your average grade is: " + (sum/grades.length));
        System.out.println("The total of grades are " + manyGrades + ".");

        entry.close();
    }
}

package com.cod3r.ArraysNdCollections;

public class ForEach {

    public static void main(String[] args) {

        double[] grades = { 9.9, 8.4, 7.6, 9.7 };
        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }

        for(double grade: grades){
            System.out.println(grade);
        }
    }
}

package com.cod3r.ArraysNdCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("How many students?? ");
        int manyStudents = entry.nextInt();

        System.out.println("How many grades by students???");
        int manyGrades = entry.nextInt();

        double [] [] classGrades = new double[manyStudents] [manyGrades];

        double allGrades = 0;

        for (int i = 0; i < classGrades.length; i++){
            for (int j = 0; j < classGrades[i].length; j++){
                System.out.printf("Please insert the grade %d of the student %d: ", j +1 , i + 1);

                classGrades[i][j] = entry.nextDouble();
                allGrades += classGrades[i][j];
            }
        }

        double averageGrades = allGrades / (manyStudents*manyGrades);

        System.out.println("The average of the Students Grades is: " + averageGrades);

        for(double[] studentsGrade: classGrades){
            System.out.println(Arrays.toString(studentsGrade));
        }


        entry.close();
    }
}



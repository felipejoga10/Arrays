package com.cod3r.ArraysNdCollections;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] gradesStudent = new double[4];
        gradesStudent[0] = 7.3;
        gradesStudent[1] = 9.0;
        gradesStudent[2] = 8.4;
        gradesStudent[3] = 7.6;

        System.out.println(Arrays.toString(gradesStudent));
        System.out.println(gradesStudent[1]);
        System.out.println(gradesStudent[gradesStudent.length -2]);
        System.out.println(gradesStudent[3]);

        double sum = 0;
        for(int i = 0; i < gradesStudent.length; i++) {
            sum += gradesStudent[i];
        }
        System.out.println(sum / gradesStudent.length);


        double[] gradesStudentB = { 6.8, 7.4, 10, 6.4};

        System.out.println(Arrays.toString(gradesStudentB));

        double sumStudentB = 0;
        for (int i = 0; i <gradesStudentB.length; i++){
            sumStudentB += gradesStudentB[i];
        }

        System.out.println(sumStudentB / gradesStudentB.length);
    }
}

package com.cod3r.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ClassySet {

    public static void main(String[] args) {

        Set<String> AprovedList = new HashSet<>();

        AprovedList.add("Xandy");
        AprovedList.add("De Pilares");
        AprovedList.add("Waltuirso");
        AprovedList.add("Chama");
        AprovedList.add("Óvos Mols");

        for (String student: AprovedList){
            System.out.println(student);
        }

        SortedSet<String> classyList = new TreeSet<>();
        classyList.add("ChupaCu");
        classyList.add("Lobisman");
        classyList.add("It");
        classyList.add("FreddyCuguer");
        classyList.add("ChapaHall");

        for (String badGuys: classyList){
            System.out.println(badGuys);
        }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);

        for (int n: numbers){
            System.out.println(n);
        }
    }
}

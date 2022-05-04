package com.cod3r.Collections;

import java.util.HashSet;

public class MessySet {

    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add(1.2);
        set.add(true);
        set.add("sure");
        set.add(1);
        set.add('X');

        System.out.println("The Size is " + set.size());

        set.add("Sure");

        System.out.println("The Size is " + set.size());

        System.out.println(set.remove("Sure"));

        System.out.println("The Size is " + set.size());

        System.out.println(set.contains('X'));

        System.out.println(set);
    }
}

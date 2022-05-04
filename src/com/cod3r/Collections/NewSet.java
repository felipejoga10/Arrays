package com.cod3r.Collections;

import java.util.HashSet;
import java.util.Set;

public class NewSet {

    public static void main(String[] args) {

        Set numbers = new HashSet();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        HashSet letters = new HashSet();

        letters.add('A');
        letters.add('B');
        letters.add('C');

        System.out.println(letters);

        numbers.addAll(letters);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);

    }
}

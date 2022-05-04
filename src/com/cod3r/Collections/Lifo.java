package com.cod3r.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lifo {

    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<>();

        books.add("In Search of Lost Time");
        books.push("Ulysses ");
        books.push("Don Quixote");
        books.push("One Hundred Years of Solitude");
        books.push("The Great Gatsby");
        books.push("Moby Dick");
        books.push("War and Peace");
        books.push("Hamlet");

        System.out.println("The size is: " + books.size());

        for (String book: books) {
            System.out.println(book);
        }
        System.out.println(books.peek());
        System.out.println(books.element());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());

    }
}

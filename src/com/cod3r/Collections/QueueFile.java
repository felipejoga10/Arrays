package com.cod3r.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFile {

    public static void main(String[] args) {

        Queue<String> oneQueue = new LinkedList<>();

        oneQueue.add("Jaguatirica");
        oneQueue.offer("Sussuarana");
        oneQueue.offer("Onça Pintada");
        oneQueue.add("Gato de Mato");
        oneQueue.offer("Puma");

        System.out.println(oneQueue.peek());
        System.out.println(oneQueue.element());

        oneQueue.size();
        oneQueue.isEmpty();
        System.out.println(oneQueue.poll());
        System.out.println(oneQueue.poll());
        System.out.println(oneQueue.poll());
        System.out.println(oneQueue.poll());
        System.out.println(oneQueue.poll());

    }
}

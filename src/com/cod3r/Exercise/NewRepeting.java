package com.cod3r.Exercise;

import java.util.Arrays;

public class NewRepeting {

    static void printRepeatingOcurrency(int arr[], int n){

        long binary = 0L;
        long position;

        for (int i = 0; i < n; ++i) {
            position = 1 << arr[i];
            binary ^=position;

        position = 1 << arr[i];

        if (!((position & binary)!= 0)) {
            System.out.print(arr[i] + " ");
            binary ^= position;

        }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 25, 30, 35, 40, 45, 50, 15, 35, 50};

        int n = arr.length;

        printRepeatingOcurrency(arr, n);
    }

}

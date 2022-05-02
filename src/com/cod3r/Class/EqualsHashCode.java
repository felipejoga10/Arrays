package com.cod3r.Class;

public class EqualsHashCode {

    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "Felipe Zanatta";
        u1.email = "bavaresco3@yahoo.com.br";

        User u2 = new User();
        u2.name = "Felipe Zanatta";
        u2.email = "bavaresco3@yahoo.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}

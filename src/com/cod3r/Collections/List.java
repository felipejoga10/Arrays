package com.cod3r.Collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("Sabotage");

        list.add(u1);
        list.add(new User("Tupac"));
        list.add(new User("Biggie"));
        list.add(new User("Mano Brown"));
        list.add(new User("Mac Miller"));
        list.add(new User("XXXTentacion"));

        System.out.println(list.get(3));
        for (User u: list){
            System.out.println(u.name);
        }

        System.out.println(">>>>" + list.remove(2));
        System.out.println(list.remove(new User("Mac Miller")));

        System.out.println("Contain this element?? " +list.contains(new User("Tupac")));
    }
}

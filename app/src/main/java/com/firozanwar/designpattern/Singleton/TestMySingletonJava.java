package com.firozanwar.designpattern.Singleton;

import kotlin.jvm.JvmStatic;

public class TestMySingletonJava {

    @JvmStatic
     public void test(){

        MySingletonJava x = MySingletonJava.getInstance();
        MySingletonJava y = MySingletonJava.getInstance();
        MySingletonJava z = MySingletonJava.getInstance();

        x.s = (x.s).toUpperCase();

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

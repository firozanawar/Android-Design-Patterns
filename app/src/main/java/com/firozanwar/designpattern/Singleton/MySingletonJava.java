package com.firozanwar.designpattern.Singleton;

/**
 * A singleton is a class that allows only a single instance of itself to be created and gives
 * access to that created instance. It contains static variables that can accommodate unique
 * and private instances of itself. It is used in scenarios when a user wants to restrict the
 * instantiation of a class to only one object. This is helpful usually when a single object
 * is required to coordinate actions across a system.
 */
public class MySingletonJava {

    private static MySingletonJava instance = null;

    // Declaring a variable of type String
    public String s;

    private MySingletonJava() {
        s = "Hello I am a string part of Singleton class";
    }

    public static MySingletonJava getInstance() {
        if (instance == null) {
            synchronized (MySingletonJava.class) {
                if (instance == null) {
                    instance = new MySingletonJava();
                }
            }
        }
        return instance;
    }
}

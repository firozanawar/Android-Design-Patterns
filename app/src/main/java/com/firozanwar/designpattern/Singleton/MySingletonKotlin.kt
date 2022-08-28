package com.firozanwar.designpattern.Singleton

/**
 * A singleton is a class that allows only a single instance of itself to be created and gives
 * access to that created instance. It contains static variables that can accommodate unique
 * and private instances of itself. It is used in scenarios when a user wants to restrict the
 * instantiation of a class to only one object. This is helpful usually when a single object
 * is required to coordinate actions across a system.
 */
object MySingletonKotlin {

    init {
        println("Hello Kotlin Singleton")
    }

    fun callMe() {
        println("Hi Kotlin Singleton from callMe")
    }
}
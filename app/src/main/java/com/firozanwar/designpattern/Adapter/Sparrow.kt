package com.firozanwar.designpattern.Adapter

class Sparrow : Bird {

    override fun fly() {
        println("Flying");
    }

    override fun makeSound() {
        println("Chirp Chirp");
    }
}
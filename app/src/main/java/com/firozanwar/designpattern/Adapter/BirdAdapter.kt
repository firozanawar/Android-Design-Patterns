package com.firozanwar.designpattern.Adapter

class BirdAdapter(val bird: Bird) : ToyDuck {

    override fun squeak() {
        bird.makeSound()
    }
}
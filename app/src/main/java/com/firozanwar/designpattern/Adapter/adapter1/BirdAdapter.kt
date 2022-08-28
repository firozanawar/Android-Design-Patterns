package com.firozanwar.designpattern.Adapter.adapter1

class BirdAdapter(val bird: Bird) : ToyDuck {

    override fun squeak() {
        bird.makeSound()
    }
}
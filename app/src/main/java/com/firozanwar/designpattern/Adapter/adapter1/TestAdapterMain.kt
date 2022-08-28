package com.firozanwar.designpattern.Adapter.adapter1

class TestAdapterMain {

    fun main(args: Array<String>) {

        val sparrow = Sparrow()
        val toyDuck: ToyDuck = PlasticToyDuck()

        sparrow.fly()
        sparrow.makeSound()

        toyDuck.squeak()

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        val birdAdapter = BirdAdapter(sparrow)

        // toy duck behaving like a bird
        birdAdapter.squeak()
    }
}
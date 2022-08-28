package com.firozanwar.designpattern.DependencyInjection.di1

class Car(val engine: Engine) {

    // Not a DI, this is tightly coupled
    // private val engine: Engine = Engine()

    fun start() {
        engine.startEngine()
    }
}
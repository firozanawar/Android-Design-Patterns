package com.firozanwar.designpattern.Factory.factory2

class Americano : Coffee {
    override fun name(): String {
        return "Expresso, Hot water"
    }

    override fun recipe(): String {
        return "Caffè Americano"
    }
}
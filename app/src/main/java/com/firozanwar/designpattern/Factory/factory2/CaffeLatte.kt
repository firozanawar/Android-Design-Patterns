package com.firozanwar.designpattern.Factory.factory2

class CaffeLatte: Coffee {

    override fun name(): String {
        return "CaffeLatte"
    }

    override fun recipe(): String {
        return "Expresso"
    }
}
package com.firozanwar.designpattern.Factory.factory1

class Euro : Currency {
    override fun symbol(): String {
        return "€"
    }

    override fun code(): String {
        return "EUR"
    }
}
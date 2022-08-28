package com.firozanwar.designpattern.Factory.factory1

class USDollar : Currency {
    override fun symbol(): String {
        return "$"
    }

    override fun code(): String {
        return "USD"
    }
}
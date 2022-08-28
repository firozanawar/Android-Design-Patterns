package com.firozanwar.designpattern.Factory.factory1

/**
 * Factory Pattern is one of the most popular creational pattern.
 * As the name suggests, Factory takes care of all the object creational logic. In this pattern,
 * a factory class controls which object to instantiate. Factory pattern comes in handy when
 * dealing with many common objects. You can use it where you might not want to specify a
 * concrete class.
 *
 * In the Factory pattern, we create an object without exposing the creation logic to the client
 * and the client uses the same common interface to create a new type of object.
 */
object CurrencyFactory {

    fun currency(country: Country): Currency {
        return when (country) {
            Country.UnitedState -> USDollar()
            Country.Spain -> Euro()
        }
    }
}
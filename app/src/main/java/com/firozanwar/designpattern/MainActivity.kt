package com.firozanwar.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firozanwar.designpattern.Builder.Hamburger
import com.firozanwar.designpattern.Factory.factory1.Country
import com.firozanwar.designpattern.Factory.factory1.CurrencyFactory
import com.firozanwar.designpattern.Factory.factory2.Coffee
import com.firozanwar.designpattern.Factory.factory2.CoffeeFactory
import com.firozanwar.designpattern.Singleton.MySingletonKotlin
import com.firozanwar.designpattern.Singleton.TestMySingletonJava
import kotlinx.android.synthetic.main.activity_main.*

/**
 * https://medium.com/@ahmadkazimi/6-design-patterns-every-android-developer-must-know-53d912b5864b
 */
class MainActivity : AppCompatActivity() {

    private var isChanged: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ************ Singleton Pattern *********** //

        // Test the java singleton
        val mytestSingletonJava = TestMySingletonJava()
        mytestSingletonJava.test()

        // Test the kotlin singleton
        MySingletonKotlin.callMe()

        // ************ Factory Pattern *********** //
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
        val code = CurrencyFactory.currency(Country.UnitedState).code()
        val symbol = CurrencyFactory.currency(Country.UnitedState).symbol()
        println("code: ${code} symbol: ${symbol}")

        //Set button click
        coffee_btn.setOnClickListener {
            var factory: Coffee
            if (isChanged) {
                factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.AMERICANO)
                isChanged = false
            } else {
                factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.LATTE)
                isChanged = true
            }

            changeCoffeeType(factory.recipe(), factory.name())
        }

        // ************ Builder Pattern *********** //
        // Builder pattern aims to “Separate the construction of a complex object from its
        // representation so that the same construction process can create different representations.”
        val hamburger =
            Hamburger.Builder().setParam2(45).setParam1("Khan").setParam3(false).build()
        println("${hamburger.param1} ${hamburger.param2} ${hamburger.param3}")

        // ************ Facade Pattern *********** //
        /**
         * The Facade pattern provides a higher-level interface that makes a set of other interfaces easier to use.
         * A facade, in the context of software design, is an object that provides a simplified
         * interface to a larger body (or more complex) functionalities. This is useful especially
         * when the client just need to simply call the interface in order to perform some tasks
         * without having to know the implementation details of it.
         */
        /*

        interface BooksApi {
            @GET("books")
            fun listBooks(): Call<List<Book>>
        }
         */

        // ************ Dependency Injection *********** //
        /*
        * dependency injection has you provide any required objects to instantiate a new object.
        * This new object doesn’t need to construct or customize the objects themselves.
        */
        // Check out th Car class in di1 package.

        // ************ Adaptere Pattern *********** //
        /**
         * this pattern lets two incompatible classes work together by converting a class’s
         * interface into the interface the client expects.
         */

    }

    /**
     * Method that changes the coffee type
     */
    private fun changeCoffeeType(recipe: String, name: String) {
        coffee_recipe.text = recipe
        coffee_name.text = name
    }
}
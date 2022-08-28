package com.firozanwar.designpattern.Builder

/**
 * rules are followed to make a Builder class:
A private constructor
An inner class usually called Builder
function for each field to set the field value return
function build return instance of the Main class
 */
class Hamburger private constructor(
    builder: Builder
) {
    var param1: String? = null
    var param2: Int? = null
    var param3: Boolean? = null

    class Builder(
        private var param1: String? = null,
        private var param2: Int? = null,
        private var param3: Boolean? = null
    ) {
        fun setParam1(value: String) = apply { param1 = value }
        fun setParam2(value: Int) = apply { param2 = value }
        fun setParam3(value: Boolean) = apply { param3 = value }

        fun build() = Hamburger(this)

        fun getParam1() = param1
        fun getParam2() = param2
        fun getParam3() = param3
    }

    init {
        param1 = builder.getParam1()
        param2 = builder.getParam2()
        param3 = builder.getParam3()
    }
}
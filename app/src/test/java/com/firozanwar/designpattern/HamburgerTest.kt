package com.firozanwar.designpattern

import com.firozanwar.designpattern.Builder.Hamburger
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class HamburgerTest {

    @Test
    fun builderTest(){
        val hamburgerTest =
            Hamburger.Builder().setParam2(45).setParam1("Khan").setParam3(false).build()

        //assert(hamburgerTest.param1.equals("khan"))
        //assert(hamburgerTest.param2.equals(45))
        //assert(hamburgerTest.param3.equals(false))
        assertTrue(hamburgerTest.param1.equals("khan"))
    }
}
package com.example.myapplication

import junit.framework.Assert
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class MainUnitTest {

    lateinit var calculation: Calculation

    @Before
    fun before() {
        calculation = Calculation()
    }

    @Test
    fun test_1() {
       assertEquals(15,calculation.calc(4,5))
    }

    @Test
    fun test_2() {
        assertEquals(41,calculation.calc(4,5))
    }

    @Test
    fun test_3() {
        Assume.assumeNotNull(3)
    }

    @Test
    fun test_4() {
        Assume.assumeNotNull(null)
    }

    @Test(expected = NullPointerException::class)
    fun test_5() {
        assertTrue(calculation.getStr(null))
    }
}
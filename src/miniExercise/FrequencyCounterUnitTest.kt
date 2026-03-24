package com.example.crm.app.miniExercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FrequencyCounterUnitTest {
    private val counter = FrequencyCounter()

    @Test
    fun `should count correctly`() {
        val result = counter.countFrequency("aabccc")

        assertEquals(2, result['a'])
        assertEquals(1, result['b'])
        assertEquals(3, result['c'])
    }

    @Test
    fun `should throw exception when input has space`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            counter.countFrequency("a a b")
        }

        assertEquals("Input cannot contain spaces", exception.message)
    }

    @Test
    fun `should throw exception when input is blank`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            counter.countFrequency("")
        }

        assertEquals("Input cannot be blank", exception.message)
    }
}
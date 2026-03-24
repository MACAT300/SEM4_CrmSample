package com.example.crm.app.miniExercise

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzExerciseUnitTest {

    private val fizzBuzz = FizzBuzzExercise()

    @Test
    fun `should generate correct fizzbuzz for 5`() {
        val result = fizzBuzz.generateFizzBuzz(5)

        assertEquals(listOf("1", "2", "Fizz", "4", "Buzz"), result)
    }

    @Test
    fun `should generate correct fizzbuzz for 15`() {
        val result = fizzBuzz.generateFizzBuzz(15)

        assertEquals("FizzBuzz", result[14])
    }

    @Test
    fun `should throw exception when n is zero`() {
        assertThrows(IllegalArgumentException::class.java) {
            fizzBuzz.generateFizzBuzz(0)
        }
    }

    @Test
    fun `should throw exception when n is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            fizzBuzz.generateFizzBuzz(-5)
        }
    }
}
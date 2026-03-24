package com.example.crm.app.miniExercise

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AsteriskExerciseUnitTest {

    private lateinit var exercise: AsteriskExercise

    @BeforeEach
    fun setUp() {
        exercise = AsteriskExercise()
    }

    @Test
    fun `should return single asterisk when n is 1`() {
        val result = exercise.buildAsteriskPattern(1)
        assertEquals("*", result)
    }

    @Test
    fun `should return two rows when n is 2`() {
        val result = exercise.buildAsteriskPattern(2)
        assertEquals("*\n**", result)
    }

    @Test
    fun `should return three rows when n is 3`() {
        val result = exercise.buildAsteriskPattern(3)
        assertEquals("*\n**\n***", result)
    }

    @Test
    fun `should return correct pattern when n is 5`() {
        val result = exercise.buildAsteriskPattern(5)
        assertEquals("*\n**\n***\n****\n*****", result)
    }

    @Test
    fun `should throw exception when n is 0`() {
        assertThrows(IllegalArgumentException::class.java) {
            exercise.buildAsteriskPattern(0)
        }
    }

    @Test
    fun `should throw exception when n is negative`() {
        assertThrows(IllegalArgumentException::class.java) {
            exercise.buildAsteriskPattern(-3)
        }
    }
}
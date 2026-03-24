package com.example.crm.app.miniExercise

class FizzBuzzExercise {

    /**
     * Generate FizzBuzz result from 1 to n
     *
     * Rules:
     * - Multiple of 3 → "Fizz"
     * - Multiple of 5 → "Buzz"
     * - Multiple of both → "FizzBuzz"
     */
    fun generateFizzBuzz(n: Int): List<String> {
        if( n <= 0 ) {
            throw IllegalArgumentException ( "n must be greater than 0" )
        }
        val result = mutableListOf<String>()
        for (i in 1..n) {
            if (i % 15 == 0) {
                result.add("FizzBuzz")
            } else if (i % 3 == 0) {
                result.add("Fizz")
            } else if (i % 5 == 0) {
                result.add("Buzz")
            } else {
                result.add(i.toString())
            }
        }
        return result
    }
}
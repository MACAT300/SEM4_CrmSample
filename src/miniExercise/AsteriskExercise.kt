package com.example.crm.app.miniExercise

class AsteriskExercise {
    /**
     * Builds an asterisk triangle pattern.
     *
     * Example:
     * Input: 3
     * Output:
     * *
     * **
     * ***
     *
     * @param n number of rows in the pattern
     * @return a string representing the asterisk pattern
     * @throws IllegalArgumentException if n <= 0
     */
    fun buildAsteriskPattern(n: Int): String {
        require(n > 0) { "n must be greater than 0" }

        val result = StringBuilder()

        for (i in 1..n) {
            for (j in 1..i) {
                result.append("*")
            }
            if (i != n) {
                result.append("\n")
            }
        }

        return result.toString()
    }
}
package com.example.crm.app.miniExercise

class FrequencyCounter {
    /**
     * Counts frequency of each character in a string.
     *
     * Rules:
     * - Case insensitive (A == a)
     * - DO NOT allow spaces (will throw exception)
     *
     * Example:
     * Input: "aabccc"
     * Output: {a=2, b=1, c=3}
     */
    fun countFrequency(text: String): Map<Char, Int> {
        if (text.isBlank()) {
            throw IllegalArgumentException("Input cannot be blank")
        }
        if (text.contains(" ")) {
            throw IllegalArgumentException("Input cannot contain spaces")
        }
        val result = mutableMapOf<Char, Int>()
        for (char in text.lowercase()) {
            result[char] = result.getOrDefault(char, 0) + 1
        }
        return result
    }
}
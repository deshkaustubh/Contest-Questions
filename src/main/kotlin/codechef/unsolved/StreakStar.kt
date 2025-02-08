package org.example.codechef.unsolved

// https://www.codechef.com/problems/STKSTR
fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, x) = readln().split(" ").map { it.toInt() }
        val elements = readln().split(" ").map { it.toInt() }.toMutableList()
        println(maxStreakValue(elements, x))
    }
}

fun maxStreakValue(elements: MutableList<Int>, x: Int): Int {
    var maxStreak = calculateStreak(elements)
    for (i in elements.indices) {
        val original = elements[i]
        elements[i] *= x
        maxStreak = maxOf(maxStreak, calculateStreak(elements))
        elements[i] = original
    }
    return maxStreak
}

fun calculateStreak(arr: List<Int>): Int {
    var maxStreakValue = 1
    var currentStreakValue = 1
    for (i in 1 until arr.size) {
        if (arr[i] >= arr[i - 1]) {
            currentStreakValue++
        } else {
            maxStreakValue = maxOf(maxStreakValue, currentStreakValue)
            currentStreakValue = 1
        }
    }
    return maxOf(maxStreakValue, currentStreakValue)
}

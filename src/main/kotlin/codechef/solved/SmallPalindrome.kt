package org.example.codechef.solved

//https://www.codechef.com/problems/SMLPAL
//06 Jan 2025 wednesday codeChef contest

// x = one's
// y = two's
// both are even

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (noOfOnes, noOfTwos) = readln().split(" ").map {it.toInt()}
        println(smallPalindrome(noOfOnes, noOfTwos))
    }
}

fun smallPalindrome(noOfOnes: Int, noOfTwos: Int):String {
    return  "1".repeat(noOfOnes / 2) +
            "2".repeat(noOfTwos / 2) +
            "2".repeat(noOfTwos / 2) +
            "1".repeat(noOfOnes / 2)
}
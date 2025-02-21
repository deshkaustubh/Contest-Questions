package org.example.codechef.solved

// [19-02-2025]

// n -> length of name, all lowercase
// a -> string, competitor
// wants lexixographically larger than a both reverse and fwd

import kotlin.random.Random

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val a = readln()
        val result = lexicographically(n, a)
        println(result)
    }
}

fun lexicographically(n: Int, a: String): String {
    if (a.all {it == 'z'}) return "-1"
    var resultString = ""
    for(i in 0 until n) {
        val x = maxOf(a[i].toInt(), a[n-1-i].toInt())
        resultString = resultString + (Random.nextInt(x,123)).toChar()
    }
    return resultString
}
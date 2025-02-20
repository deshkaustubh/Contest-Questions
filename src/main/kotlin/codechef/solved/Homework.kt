package org.example.codechef.solved

// [19-02-2025]

fun main () {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val result = homework(x, y)
    println(result)
}

fun homework(x: Int , y: Int): String {

    for(i in 0..10) {
        if(x + (y * i) >= 100) {
            return "yes"
            break
        }
    }
    return "no"
}
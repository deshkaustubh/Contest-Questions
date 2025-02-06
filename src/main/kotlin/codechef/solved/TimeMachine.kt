package org.example.codechef.solved

//https://www.codechef.com/problems/TIMA
//06 Jan wednesday codeChef contest

fun main() {
    val x = readln().toInt()
    println(timeMachine(x))
}

fun timeMachine(x: Int): String {
    return if (x + 25 >= 2050) {
        "Yes"
    }
    else {
        "No"
    }
}
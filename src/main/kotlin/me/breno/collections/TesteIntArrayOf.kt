package me.breno.collections

fun main() {
    //Inicializando um array de ints usando o intArrayOf:
    val values = intArrayOf(1, 7, 6, 3, 2)
    val skip = "-------------------"

    values.forEach {
        println(it)
    }

    println(skip)
    values.sort()
    values.forEach {
        println(it)
    }
}
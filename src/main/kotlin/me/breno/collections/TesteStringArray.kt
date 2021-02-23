package me.breno.collections

fun main() {
    val names = Array(3) {""}
    val skip = "------------------------"
    names[0] = "Maria"
    names[1] = "Breno"
    names[2] = "Jose"

    for (name in names) {
        println(name)
    }
    println(skip)
    names.sort()
    names.forEach { println(it) }

    val names2 = arrayOf("Maria","Breno","Jose")

    println(skip)
    names2.sort()
    names2.forEach { println(it) }
}
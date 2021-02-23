package me.breno.collections

fun main() {
    val skip = "----------------"
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
        //salarios[index] *= 1.1
    }

    println(skip)
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    println(skip)

    salarios2.forEach { println(it) }
}
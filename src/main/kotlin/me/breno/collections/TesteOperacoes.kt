package me.breno.collections

fun main() {
    val skip = "------------------------"
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println(skip)
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }

    println(skip)
    salariosMaiorQue2500.forEach { println(it) }

    println(skip)
    println(salarios.count { it in 2000.0..5000.0 })

    println(skip)
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println(skip)
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })

    println(skip)

}
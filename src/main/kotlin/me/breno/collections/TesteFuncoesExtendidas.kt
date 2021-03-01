package me.breno.collections

fun main() {
    val skip = "-------------"
    val salarios = arrayOf(
            "2000".toBigDecimal(),
            "1500".toBigDecimal(),
            "4000".toBigDecimal()
    )

    println(salarios.somatoria())

    println(skip)
    println(salarios.media())
}
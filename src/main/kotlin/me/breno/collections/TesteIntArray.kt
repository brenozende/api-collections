package me.breno.collections

fun main() {
    //Inicialização do array
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //Duas formas de imprimir cada valor do array:
    for (value in values) { //value = 1, 7, 6, 3, 2
        println(value)
    }
    values.forEach {
        println(it)
    }

    //Para mudar a referencia da variavel de "it" para outra, nesse caso "valor":
    values.forEach { valor ->
        println(valor)
    }

    //Iterando sobre os indices, e não os valores em si:
    for (index in values.indices) { //index = 0, 1, 2, 3, 4
        println(values[index])
    }

    //Iterando sobre o array ordenado de forma crescente pelo sort():
    values.sort()
    for (value in values) {
        println(value)
    }


}
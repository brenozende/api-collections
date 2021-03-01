package me.breno.collections

fun main() {
    val skip = "------------------"
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println(skip)
    repositorio.findAll().forEach { println(it) }

    println(skip)
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}
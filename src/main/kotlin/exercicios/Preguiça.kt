package exercicios

class Preguiça(override var nome: String, override var idade: Int):Animal {
    override fun deslocar() {
        println("Escalando a árvore")
    }

    override fun som() {
        println("Zzzzz")
    }
}
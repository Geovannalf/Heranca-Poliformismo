package exercicios

class Cavalo(override var nome: String, override var idade: Int):Animal {
    override fun deslocar() {
       println("Correndo como um cavalo")
    }

    override fun som() {
        println("Relinchando")
    }
}

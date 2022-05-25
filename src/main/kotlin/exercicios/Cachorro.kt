package exercicios

class Cachorro (override var nome: String, override var idade: Int): Animal{
    override fun deslocar() {
        println("Andando como um cachorro")
    }

    override fun som() {
        println("Au au au")
    }
}
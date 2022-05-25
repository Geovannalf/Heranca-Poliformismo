import exercicios.Cachorro
import exercicios.Cavalo
import exercicios.Preguiça

fun main(args: Array<String>) {
    val cachorro = Cachorro ("Zeca", 8)
    val preguiça = Preguiça("Amorinha",2)
    val cavalo = Cavalo("Estrela",15)

    cachorro.som()
    cavalo.som()
    preguiça.som()



}
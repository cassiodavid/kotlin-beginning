package interacoes
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                        // 2
    }
}

fun main() {

    var lista = listOf(Animal("zebra"), Animal("lion"))
    var listaanimas = mutableListOf<Animal>()

    listaanimas.add(Animal("cavalo"))
    listaanimas.add(Animal("camelo"))


    val zoo = Zoo(lista)

    val zoo2 = Zoo(listaanimas)


    for (animal in zoo2) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }


    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}
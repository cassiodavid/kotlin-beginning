package dataClasses


data class DataClasses(val  name: String, val id: Int){
    override fun equals(other: Any?) = other is DataClasses && other.id == this.id

}

fun main(args: Array<String>) {

    val dataClasses = DataClasses("cassio", 1)
    println(dataClasses)

    println("-----------------------")

    val dataClasses1 = DataClasses("Alex", 1)
    val dataClasses2 = DataClasses("Max", 2)


    // hashCode() function
    println(dataClasses.hashCode())
    println(dataClasses1.hashCode())
    println(dataClasses2.hashCode())

    println("-----------------------")

    // copy() function
    println(dataClasses.copy())                                   // 6
    println(dataClasses === dataClasses.copy())                          // 7
    println(dataClasses.copy("Max"))                              // 8
    println(dataClasses.copy(id = 3))


    println("name = ${dataClasses.component1()}")                 // 10
    println("id = ${dataClasses.component2()}")
}
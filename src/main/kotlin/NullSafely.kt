fun main(args: Array<String>) {

    /*
    Ele Nem deixa copilar! '-' amei amei!

    var neverNull: String = "This can't be null"            // 1

    neverNull = null

    */
    // 2

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null // Não permite Null   // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

   // inferredNonNull = null                                  // 6


    println(nullable)                                  // 8
   // println(strLength(nullable))


    var count : Int = 10

    println(count)

    count = 2
    println(count)

    val umNome : String = "Um Nome"

    println(umNome)


    //String Noot Null
   // val languageName: String = null

    //Coloca uma ? e pode aceitar valores null
    val algoNullo : String? = null
}

fun strLength(notNull: String): Int {                   // 7
    return notNull.length
}
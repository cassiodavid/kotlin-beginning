/*
* Estudos Kotlin basico
* */
fun main(args: Array<String>) {

     val caralhos = mutableListOf<String>()
    caralhos.add("oxi")

    println(caralhos.size)

    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)


}

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun basics() {
    val a: Int = 1  // immediate assignment
    val b = 2       // `Int` type is inferred

    val c: Int      // Type required when no initializer is provided
    c = 3           // deferred assignment

    var xp = 5 // `Int` type is inferred
    xp += 1

    val PI = 3.14
    var x = 0

    // louco demais! uahrUHRUERH
    fun incrementX() {
        fun dentro(y: Int): Int  {
            return y
        }

        x = dentro(5)
    }
    println(x)
}

fun sum1(a: Int, b: Int): Int {
    return a + b
}
fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b


fun forItens() {

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }


    val items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items2.indices) {
        println("item at $index is ${items2[index]}")
    }
}

fun whilleLoop(){

    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}
//Aqui precisa ser estudado "when"
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

//Ranges... Isso é legal :D

fun ranges() {

    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun steps(): Unit {

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

//Collection

fun main() {
    val items = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}


fun lambdaExpressionFIlterAndMapa(): Unit {

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }


}
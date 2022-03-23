package colecoes

fun main(args: Array<String>) {
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val doubledWithIt = numbers.map {it * 2 }

    val tripled = numbers.map { it * 3 }


    println(doubled)
    println(tripled)
    println(doubledWithIt)

}
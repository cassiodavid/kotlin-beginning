fun main(args: Array<String>) {

    val count : Int = 42

    if (count == 22) {
        println(" igual :| ")
    } else {
        println(" diferente! :D ")
    }



    if (count == 24) {
        println("igual .")
    } else if (count > 69) {
        println("maior que ")
    } else {
        println(" else ")
    }


    // Isso é Lindo demais <3

    val nomeSalvoIfElse: String = if (count == 42) {
        "Um texto salvo na variavel no If :D "
    } else if (count > 35) {
        "Um texto salvo na variavel no Else If :D "
    } else {
        "Um texto salvo na variavel no Else :D  "
    }

    println(nomeSalvoIfElse)


    // Isso aque ja é mais Eleganteee Uii UIii
    val blocoElegante = when {
        count == 10 -> "Um texto salvo na variavel no If :D "
        count > 35 ->  "Um texto salvo na variavel no Else If :D "
        else ->        "Um texto salvo na variavel no Else :D  "
    }

    println(blocoElegante)

}
package enum

enum class EnumClasses {
    EU, TU , ELE , ELA
}

fun main234(args: Array<String>) {

    val state = EnumClasses.EU

    val message = when (state) {                      // 3
        EnumClasses.EU -> "Sou eu"
        EnumClasses.TU -> "Tu e Tu"
        EnumClasses.ELE -> "Ele e Ele"
        EnumClasses.ELA -> "ELa e Ela"
    }

    println(message)
}

enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6
    println(Color.YELLOW.containsRed())               // 7
}
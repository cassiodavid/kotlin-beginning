package interacoes

fun main(args: Array<String>) {

    for (c in 'a'..'z') {

        if (c != 'a' && c != 'e'&& c != 'i'&& c != 'o' &&  c != 'u'){
            print(c)
        }

    }
    print(" ")

    for (c in 'z' downTo 'a') { // 2
        print(c)
    }
    print(" ")

}
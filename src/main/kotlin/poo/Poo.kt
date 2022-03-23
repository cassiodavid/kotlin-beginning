package poo

class Poo

class Contact(val id: Int, var email: String)

fun classes(): Unit {
    val Poo = Poo()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println("${contact.id}  + ${contact.email}")                         // 5
    contact.email = "jane@gmail.com"

    println(contact.email)

}


class MutableStack<E>(vararg items : E){
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main2() {

    val contact0 = Contact(1, "mary@gmail.com")  // 4
    val contact2 = Contact(2, "mary@gmail.com")  // 4
    val contact3 = Contact(3, "mary@gmail.com")  // 4

    val stack = mutableStackOf("a", "b", "c")
    println(stack)

    val stack2 = mutableStackOf(contact0.id,contact2.email,contact3.id)
    println(stack2)

}
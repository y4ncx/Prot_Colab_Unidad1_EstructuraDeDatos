fun main() {

    val arreglo = Array(10) { (1..100).random() }

    println("Arreglo inicial:")
    println(arreglo.joinToString(", "))
}

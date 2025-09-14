fun main() {

    val arreglo = Array(10) { (1..100).random() }

    println("Arreglo inicial:")
    println(arreglo.joinToString(", "))


    // Recorrido con for clásico
    println("\nRecorrido con for clásico:")
    for (i in arreglo.indices) {
        print("${arreglo[i]} ")
    }

    // Recorrido con for-each
    println("\n\nRecorrido con for-each:")
    for (valor in arreglo) {
        print("$valor ")
    }
    

}

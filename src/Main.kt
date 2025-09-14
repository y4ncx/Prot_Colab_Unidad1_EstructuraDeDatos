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

    // Cambiar impares por 0
    for (i in arreglo.indices) {
        if (arreglo[i] % 2 != 0) {
            arreglo[i] = 0
        }
    }
    println("\n\nArreglo después de reemplazar impares por 0:")
    println(arreglo.joinToString(", "))

    // Multiplicar cada valor por su índice
    for (i in arreglo.indices) {
        arreglo[i] = arreglo[i] * i
    }
    println("\nArreglo después de multiplicar por índice:")
    println(arreglo.joinToString(", "))

    val buscado = 20
    var encontrado = -1
    for (i in arreglo.indices) {
        if (arreglo[i] == buscado) {
            encontrado = i
            break
        }
    }

    if (encontrado != -1) {
        println("\nEl valor $buscado se encontró en la posición $encontrado")
    } else {
        println("\nEl valor $buscado no está en el arreglo")
    }

}

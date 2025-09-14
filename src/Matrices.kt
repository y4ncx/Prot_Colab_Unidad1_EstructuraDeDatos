fun main(){
    matrices()
}

fun matrices(){

    val matriz = Array(3) { fila ->
        Array(3) { col -> fila * 3 + col + 1 }
    }

    // Imprimir en forma de tabla
    println("\nMatriz en forma de tabla:")
    for (fila in matriz) {
        println(fila.joinToString("\t"))
    }

    // Recorrer por columnas
    println("\nRecorrido por columnas:")
    for (c in 0 until 3) {
        for (f in 0 until 3) {
            print("${matriz[f][c]} ")
        }
        println()
    }

    // Sumar todos los elementos
    var suma = 0
    for (fila in matriz) {
        for (valor in fila) {
            suma += valor
        }
    }
    println("\nSuma de todos los elementos: $suma")

    // Intercambiar primera fila con última
    val temp = matriz[0]
    matriz[0] = matriz[2]
    matriz[2] = temp

    println("\nMatriz después de intercambiar primera y última fila:")
    for (fila in matriz) {
        println(fila.joinToString("\t"))
    }
}

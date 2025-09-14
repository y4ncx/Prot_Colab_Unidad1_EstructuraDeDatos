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


}
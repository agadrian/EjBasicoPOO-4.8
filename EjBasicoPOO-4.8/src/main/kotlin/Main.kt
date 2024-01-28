/**
 * Ejercicio 4.8¶
 * Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos haya gustado más o menos al leerlo.
 *
 * Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación que le damos entre 0 y 10.
 *
 * Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros con la mayor y menor calificación y, por último, mostrar un contenido de todo el conjunto.
 *
 * En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.
 */

fun main() {
    val libro1 = Libro("El señor de los anillos", "J.R.R. Tolkien", 1000, 9.0)
    val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", 500, 8.5)
    val libro3 = Libro("1984", "George Orwell", 300, 7.0)
    val libro4 = Libro("19984", "George Orwell", 300, 7.0)
    val libro5 = Libro("fgfgh", "Ggfhgfhl", 3500, 2.0)
    val libro6 = Libro("Joergji", "f", 3500, 6.0)
    val libro7 = Libro("Adri", "fdd", 56, 3.0)

    val conjuntoLibros = ConjuntoLibros()

    conjuntoLibros.aniadirLibro(libro1)
    conjuntoLibros.aniadirLibro(libro2)
    conjuntoLibros.aniadirLibro(libro3)
    conjuntoLibros.aniadirLibro(libro4)
    conjuntoLibros.aniadirLibro(libro5)
    println()

    conjuntoLibros.mostrarLibros()
    println()

    conjuntoLibros.eliminarLibro("Gabriel García Márquez")
    conjuntoLibros.eliminarLibro("1984")
    conjuntoLibros.eliminarLibro("Pedrito")

    conjuntoLibros.aniadirLibro(libro3)
    conjuntoLibros.aniadirLibro(libro6)
    conjuntoLibros.aniadirLibro(libro7)
    println()

    conjuntoLibros.mostrarLibros()
    println()

    conjuntoLibros.mostrarMayorCal()
    conjuntoLibros.mostrarMenorCal()




}
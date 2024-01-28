/**
 * Clase ConjuntoLibros que almacena un conjunto de libros con un tamaño fijo.
 * Se pueden realizar diversas operaciones sobre el conjunto como añadir y eliminar libros, mostrarlos, mostrar el de mayor calificacion.
 */
class ConjuntoLibros {
    private val libros = arrayOfNulls<Libro>(5)
    // Crea un set de los tiitulos de los libros
    private val setLibros = libros.filterNotNull().map { it.titulo }.toMutableSet()

    /**
     * Añade un libro al conjunto si hay espacio y si el título no existe previamente en el conjunto.
     * @param libro El libro que se va a añadir al conjunto.
     */
    fun aniadirLibro(libro: Libro){
        if (libros.indexOf(null) != -1){
            if (libro.titulo !in setLibros){
                libros[libros.indexOf(null)] = libro
                setLibros.add(libro.titulo)
            }else{println("Este libro ya existe")}

        }else{println("No hay mas huecos para añdadir libros")}

    }

    /**
     * Elimina un libro del conjunto por título o autor.
     * @param tituloAutor El título o autor del libro que se va a eliminar.
     */
    fun eliminarLibro(tituloAutor: String){
        val indice = libros.indexOfFirst { it?.titulo == tituloAutor || it?.autor ==  tituloAutor }

        //Si no encuentra ninguna coincidencia de titulo/autor, devuelve -1
        if (indice != -1){
            libros[indice] = null
            setLibros.remove(tituloAutor)
            println("El libro con titulo/autor $tituloAutor se ha eliminado correctamente")
        }else{
            println("No se ha encontrado ningun libro con titulo/autor: $tituloAutor")
        }
    }


    /**
     * Muestra el libro con la mayor calificación en el conjunto.
     */
    fun mostrarMayorCal(){
        val librosSorted = libros.filterNotNull().sortedBy { it.calificacion }
        if (librosSorted.isNotEmpty()){
            println("Libro con mayor calificacion: ${librosSorted.last().calificacion}")
        }
    }

    /**
     * Muestra el libro con la menor calificación en el conjunto.
     */
    fun mostrarMenorCal(){
        val librosSorted = libros.filterNotNull().sortedBy { it.calificacion }
        if (librosSorted.isNotEmpty()){
            println("Libro con menor calificacion: ${librosSorted.first().calificacion}")
        }
    }

    /**
     * Muestra todos los libros con sus datos.
     */
    fun mostrarLibros() {
        println("Libros:")
        for (libro in libros) {
            if (libro != null) {
                println("Titulo: ${libro.titulo}, Autor: ${libro.autor}, Numero Paginas: ${libro.numPags}, Calificacion: ${libro.calificacion}")
            }
        }
    }
}
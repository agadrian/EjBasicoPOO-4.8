/**
 * Clase libro que crea los objetos Libro con sus propiedades y restricciones
 */
class Libro (val titulo: String, val autor: String, val numPags: Int, calificacion: Double){

    var calificacion: Double = 0.0
        set(value) {
            require (value in 0.0..10.0) { println("La calificacion debe estar entre 1-10") }
            field = value
        }

    init {
        this.calificacion = calificacion
        require(calificacion in 0.0..10.0) { println("La calificacion debe estar entre 1-10") }
    }
}
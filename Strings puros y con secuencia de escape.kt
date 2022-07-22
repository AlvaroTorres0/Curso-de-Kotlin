fun main(args: Array<String>) {
    /*
    Los Strings con secuencia de escape son los strings que nos permiten utilizar /n ó /t entre otros
    Serían como los Strings comunes
     */
    var stringConSecuenciaDeEscape = "Álvaro\nTorres"
    println(stringConSecuenciaDeEscape)

    /*
    Los Strings puros son los que respetan literal lo que se pone dentro, y es con triple comillas
    ESTO ES INCORRECTO, ya que es un String con secuencia de escape, pero con propiedades de String puro
    var stringConSecuenciaDeEscape = "Álvaro
    Torres"
     */
    var stringPuro = """Álvaro 
Torres
    """
    println(stringPuro)


    // Un objeto tiene propiedades y funciones
    var cadena: String = "Álvaro"
    println(cadena.length)


    // Concatenar, es hace parecido a Python, se hace con el símbolo de suma
    var nombre = "Álvaro"
    var apellido = "Torres"

    println("Su nombre es: " + nombre + " " + apellido)

    // Formatear cadenas, para ello hacemos uso del símbolo $ y para utlizar funciones encerramos entre corchetes {}
    println("Mi nombre es $nombre y tiene ${nombre.length} caracteres")
}
fun main(args: Array<String>){
    //CARACTERES
    var caracter:Char = 'Á'
    println(caracter)

    //Para imprimir caracteres unicode, tenemos que escribir "\caracter"
    caracter = '\uFA10'
    println(caracter)

    //Parsear char a Int
    var numeroCaracter:Char='8'
    //Lo que hará será convertirlo pero en ASCII, lo que podemos hacer es restarle 48 que es su equivalente
    var numero:Int = numeroCaracter.toInt()-48
    println(numero)


    //STRINGS
    var cadena:String = "Álvaro"
    println(cadena)
    println(cadena[0])
}
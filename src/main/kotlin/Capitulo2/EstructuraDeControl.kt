package Capitulo2
//Ejercicios
//1. Realizar el almacenamiento de dos números enteros por teclado e imprimir su suma y su produ//
//2. Calcule el lado de un cuadrado, mostrar por pantalla el área del mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)//
// 3. Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidac que Lleva el cliente. Mostrar lo que debe abonar el comprador.//
//4. Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.//
//5 Realizar un programa que Lea por teclado cuatro valores numéricos enteros e informar su suma y promedio, el programa principal llama a una funcion que devuelve el promedio.//



//Ejercicio1//
fun ejercicio1(){
    var trash: Int?
    print("Ingrese primer valor:")
    trash = readLine()?.toIntOrNull()
    val valor1: Int = trash ?: 0
    print("Ingrese segundo valor:")
    trash = readLine()?.toIntOrNull()
    val valor2: Int = trash ?: 0
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es ${valor1 + valor2}")
    println("El producto de  $valor1 y $valor2 es ${valor1 * valor2}")
}



fun ejercicio2(){
    var trash: Float?
    print("Ingrese valor del lado:")
    trash = readLine()?.toFloatOrNull()
    val lado1: Float = trash ?: 0.0f
    print("El valor del lado es: ${lado1*4}")

}



fun ejercicio3(){
    var trash: Float?
    var trashh : Int?
    print("Ingrese precio del articulo")
    trash = readLine()?.toFloatOrNull()
    val precio: Float = trash?: 0.0f
    print("Ingrese la cantidad de articulos:")
    trashh = readLine()?.toIntOrNull()
    var cantidad: Int =trashh ?: 0
    print("Debe abonar la cantidad de:${precio*cantidad}")

}


fun ejercicio4(){
    var trash: Int?
    print("Ingrese el primer valor")
    trash = readLine()?.toIntOrNull()
    val valor1: Int =trash ?: 0
    print("Ingrese el segundo valor")
    trash = readLine()?.toIntOrNull()
    val valor2: Int =trash ?: 0
    print("Ingrese el tercer valor")
    trash = readLine()?.toIntOrNull()
    val valor3: Int =trash ?: 0
    print("Ingrese el cuarto valor")
    trash = readLine()?.toIntOrNull()
    val valor4: Int =trash ?: 0

    print("La suma de los dos primeros valores es: ${valor1+valor2}")
    print("El producto de los ultimos dos digitos es: ${valor3*valor4}")
}



fun ejercicio5(){
    var trash: Int?


}

fun clasificarNumero(a:Int){
    when{
        a>0 -> print("Es positivo")
        a == 0 ->print("Es cero")
        else -> print("Es negativo") }}


fun calcularSeguro(precio_coste:Float=0f,interes:Int){
    when(val precio_venta: Float= precio_coste + interes){
        in 0.0..100.0 -> print("Iva aplicado(21%):${precio_venta+(precio_venta*0.21)}")
        in 100.0..150.0 -> print("Iva aplicado(10%):${precio_venta + (precio_venta *0.10)}")
        else -> print("Iva aplicado(0%):$precio_venta") } }


//var x=1 while (x<=100){
//   x++
//    println(x)
//    fun Xnombre() }
//


fun imprimirRango(){
    for (i in 1..10) print("$i,") }
fun sumaIncremento(numeroMax:Int){for (i in 1..numeroMax) println("Numero:$i") }


//for(i in 10>= downTo >=1)print("$i,")
//for(i in 1<= .. <= 10 step 2) print("$i,")

fun Ejercicio_fizzbuz0 (i:Int) = when{
    i % 15===0 -> "FizzBuzz"
    i % 3==0 -> "Fizz"
    i % 5==0 -> "Buzz"
else -> "$i"}

fun Ejercicio_fizzbuz2 () {
    do {
        print("Ejercicio en clase para  Realiza el programa FizzBuzz \n")
        var muk: Int?
        print("Ingresa un numero: ")
        muk = readLine()?.toIntOrNull()
        val num: Int = muk ?: 0
        var exit:Int
        if (num % 15 == 0) {
            print("FizzBuzz \n")
        } else if (num % 3 == 0) {
            print("Fizz \n")
        } else if (num % 5 == 0) {
            print("Buzz\n")
        } else {
            print("$num \n")
        }
        println("¿Quieres continuar?  Pulsa 1 para continuar o 0 para salir")
        exit = readLine()?.toIntOrNull()!!
    }while (exit!=0)

}

val paises: Map<String,Int> = mapOf(Pair("argentina",40000000),
        Pair("España", 4600000),
        Pair("Uruguay",3400000))

//Otra sintaxis comun para crear el Map en Kotlin es:

val paises_2: Map<String,Int> = mapOf("Argentina_2" to  40000000,
    "España_2" to 46000000,
    "Uruguay_2" to 3400000,
    "EEUU" to 275000000)


    fun ejemploInmutableSet(){
        var loteriaPrimitiva: Set<Int> = setOf(4,6,23,38,45,45)
        println("Ingrese un numero")
        var trash:Int?
        trash = readLine()?.toIntOrNull()
        val numero= trash ?: 2
        if (numero in loteriaPrimitiva)
        println("El numero esta premiado")
        else{
            println("Ha ganado el premio")
        }

    }


abstract class ModeloVehiculo(var modelo: String, var numbastidor:String, var peso:Int, var color:String){
    //Propiedades abstractas.
    abstract var velocidadMax: Float
    //Metodos abstractos, hay que definirlos en la clase hijo para ser llamados.
    abstract fun acelerar(valor:Int)
    abstract fun detener()
    //Métodos no abstractos definidos, pueden ser sobrescritos o llamadas.
    open fun fichaVehiculo() = println("Coche (Caracteristicas) \n  Modelo: $modelo \n No. Bastidor: $numbastidor \n Peso: $peso \n Color: $color \n Velocidad Max: $velocidadMax")
}

class ModeloSeat(_modelo:String, _bastidor:String, _peso:Int, _color:String):
    ModeloVehiculo(_modelo, _bastidor, _peso, _color){
    override var velocidadMax: Float=0f
    set(value){if (value<0) field= 0f else field = value         }
    init {
        modelo = _modelo.uppercase()
        numbastidor = _bastidor.uppercase()
        peso = _peso ?: 0
        color = _color.uppercase() }

    override fun acelerar(valor: Int) = println("Modelo Seat, acelerando a $valor")
    override fun detener()=println("Modelo Seat: Deteniendo")
    override fun fichaVehiculo() {
        println("Caracteristicas del Modelo Seat")
        super.fichaVehiculo()
    }
    }







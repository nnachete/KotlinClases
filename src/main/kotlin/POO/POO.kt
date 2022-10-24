package POO

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.StringJoiner


//En esta clase se declara la variable entre los parentesis.
class POO(val modelo:String, val puertas:Int, val velocidad:Int, val asientos:Int) {


}

//En esta clase se declaran las variables dentro de ella y en los parentesis solo van las propiedades.
class POOO(modelo:String, puertas:Int, velocidad:Int, asientos:Int) {
    val modelo= modelo
    val puertas = puertas
    val velocidad = velocidad
    val asientos = asientos
}

//Objeto llamando a la clase
val seat = POOO("seat leon", 5,160,5)


class coche(modelo:String, puertas:Int, velocidad:Int, asientos:Int) {
    val modelo= modelo
    val puertas = puertas
    var velocidad = velocidad
    val asientos = asientos
    fun cambiarVelocidad( nuevaVelocidad: Int){velocidad = nuevaVelocidad
        print("Velocidad modificada") }
    fun detener(){ val detener = "detenido" }
    fun descripcionCoche(): String = "El $modelo es un estupendo coche de $puertas con $asientos y alcanza una velocidad de $velocidad"

    val cochazo = coche("seat",5, 300,5)


}

class cochee(modeloo:String, puertaas:Int, velocidaad:Int, asientoos:Int) {
    var modelo= modeloo
    var puertas = puertaas
    var velocidad = velocidaad
    var asientos = asientoos
    init {
        modelo = modelo.uppercase()
        if (velocidad<0 || velocidad>300) velocidad= 0
        if (puertas<0 || puertas>6) puertas = 4
        if (asientos<0 || asientos>10) asientos = 5
    }

    fun cambiarVelocidad( nuevaVelocidad: Int){this.velocidad
        print("Velocidad modificada") }
    fun detener(){this.velocidad = 0}
    fun descripcionCoche(): String = "El $modelo es un estupendo coche de $puertas con $asientos y alcanza una velocidad de $velocidad"

}

class Empleado constructor(noombre: String, aapellidos: String, eedad: Int?){
    var nombre : String = noombre
        set (valor) {field = valor.uppercase()}
        get (){return "("+field+")" }

    val apellidos: String = aapellidos
    var edad: Int? = eedad
    init {
        edad= eedad?:0
    }
}


data class Vehiculo(var modelo: String,var puertas: Int,var velocidad: Int,var asientos: Byte)
{ var potenciaMax:Int=300 }
fun crearVehiculo(){
    val coche=Vehiculo("Seat",0,260,5)
    //Llamamos a la funcion toString(), que devuelve la cadena de texto con todos los valores
    println("Los datos del coche son ${coche.toString()}")
}

data class Profesor(var nip:Int,var contrato:String,var nombre:String,var nacimiento:String)
data class Tutor(var nip:Int,var contrato:String,var nombre:String,var nacimiento:String){
    init {
        var nacimiento=LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    }
    var salario:Float?=0f
        set(value){
            if (value!=null){
                if (value<0)field=0f else field=value
            } else field=0f
        }
}

data class Articulo(var codigo:Int,var descripcion:String,var precio:Float)
fun dataclassArticulo(){
    val articulo1=Articulo(1,"papas(articulo1)",3f)
    val articulo2=Articulo(2,"jamon",4f)
    val articulo3=articulo1.copy(precio = 2.50f, descripcion = "patatas(articulo3)")
    val articulo4=articulo2.copy(precio = 2f)
    val copiaArticulo3=articulo3
    println(articulo1.toString())
    print(articulo2)
    if (articulo3.equals(copiaArticulo3)) println("Son iguales $articulo3 y su copia $copiaArticulo3")else println("Articulos distintos")
    if (articulo1==articulo3) println("Son iguales $articulo1 y $articulo3")
    else println("Son distintos $articulo1 y $articulo3") }

data class dcPersona(var nombre: String,var edad:Int){
    override fun toString(): String {
        return  "${nombre.uppercase()},$edad"
    }
}
val persona1=dcPersona("Juan",36)
val persona2=dcPersona("Juana",63)


enum class Color{ROJO,AZUL,VERDE,VIOLETA,BLANCO,NEGRO}
enum class TipoCarta{DIAMANTE,PICAS,TREBOL,CORAZON}

enum class rgbColor(val r:Int,val g:Int,val b:Int){
    RED(255,0,0), BLUE(0,0,255), GREEN(0,255,0), ORANGE(255,165,0),
    YELLOW(255,255,0), INDIGO(75,0,130), VIOLET(288,130,238);
    fun rgb()=(r*256+g)*256+b //RGB a hexadecimal=(R*65536)+(G*256)+B
    fun hex()="#${(r*65536)+(g*256)+b}"
}


class Carta(val tipo:TipoCarta,val  valor: Int){
    fun imprimir()="Carta $tipo y su valor $valor"
}
//println("Valor RGB del color Blue:${rgbColor.BLUE.r},${rgbColor.Blue.g},${rgbColor.BLUE.b}Hx:${rgbColor.BLUE.hex()}")
       // val carta_trebol=Carta(TipoCarta.TREBOL,6)
//println(carta_trebol.imprimir())


/*enum class rgbColor(val r:Int,val g:Int,val b:Int){
    RED(255,0,0), BLUE(0,0,255), GREEN(0,255,0), ORANGE(255,165,0),
    YELLOW(255,255,0), INDIGO(75,0,130), VIOLET(288,130,238);
    fun rgb()=(r*256+g)*256+b //RGB a hexadecimal=(R*65536)+(G*256)+B
    fun hex()="#${(r*65536)+(g*256)+b}"
}*/

//Herencia
open class Vehiculos(var modelo: String,numbastidor:String){
    fun acelerar()= println("Vehiculo:Aumentadndo velocidad")
    open fun detener()= println("Vehiculo:Deteniendo vehiculo")
    open fun imprimir_caracteristica()= println("Vehiculo(caracteristicas)\n Modelo:$modelo") }


//La clase Coches va a heredar de la clase Vehiculos, lo indicamos con (:) y llamamos a su constructor de la clase padre
class Coches(_modelo:String,_numbastidor:String,val potencia:Int,val asientos: Int):
        Vehiculos(_modelo,_numbastidor){
    override fun imprimir_caracteristica()= println("Coche(caracteristicas)\n Modelo:$modelo\nPotencia:$potencia\n Asientos:$asientos")
    override fun detener() {
        super.detener()
        println("Coche acelerado") } }

//Abstract
abstract class ModeloVehiculo(var modelo: String,var numbastidor: String,var peso:Float?,var color:String){

    //Propiedades abstractas
    abstract var velocidadMax:Float
    //Metodos abstractos, hay que definirlos en la clase hijo para ser llamados
    abstract fun acelerar(valor: Int)
    abstract fun detener()
    //Metodos no abstractos definidos, pueden ser sobreescritos o llamados
    open fun fichaVehiculo()= println(
    "Coche:(Caracteristicas)\n Modelo:$modelo \n Bastidor:$numbastidor \n peso:$peso \n "+"Color: $color \n Velocidad Max: $velocidadMax")
}

/*class ModeloSeat(_modelo: String,_numbastidor: String,_peso:Float?,_color:String):
        ModeloVehiculo(_modelo,_numbastidor,_peso,_color){
    override var velocidadMax: Float=0f
        set(value){if (value<0) field= 0f else field=value }
       }*/




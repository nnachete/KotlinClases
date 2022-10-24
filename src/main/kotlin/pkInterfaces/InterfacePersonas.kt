package pkInterfaces

import java.util.StringJoiner

interface InterfacePersonas {
    var tipoPersona:String
    fun imprimirDatos()
    fun saludar()
    fun tipoPersona():String=tipoPersona


    class alumno(override var tipoPersona: String, var nombre:String, var apellido:String): InterfacePersonas{
        override fun imprimirDatos() {
            println("Los datos de la persona son: ($tipoPersona, $nombre, ${apellido})")
        }//imrpirmir datos
        override fun saludar() {
            println("Hola($nombre) te estoy saludando")
        }//saludar
        override fun tipoPersona(): String {
            println("El tipo de persona es: ($tipoPersona)")
            return super.tipoPersona()
        }//tipoPersona


        class empleado(override var tipoPersona: String, var nombre:String, var apellido:String, var salario:Int): InterfacePersonas{
            override fun imprimirDatos() {
                println("Los datos son: ($tipoPersona, $nombre, $apellido, $salario)")
            }//imprimir datos
            override fun saludar() {
                println("Hola ($nombre), te estoy saludando")
            }//saludar
            override fun tipoPersona(): String {
                println("El tipo de persona es ($tipoPersona)")
                return super.tipoPersona()
            }//tipoPersona
        }//class empleado
    }//class alumno
}//interface




package EjerciciosPOO

import java.util.StringJoiner

/*Ejercicio1 POO Crear una clase Persona donde sus atributos son (Nombre y edad)"), crear el método
imprimir, donde se muestre la clasificación de la persona según su edad. menor (<18años),joven (18 a 29 )
, adulto en cualquier otro rango*/

/*class Persona(val nombre: String,var edad: Int?) {
    fun imprimir() {
        if (edad < 18) {
            print("La persona $nombre Es menor de edad")
        } else if (edad in 18 .. 29) {
            print("La persona $nombre es joven")
        }else {
            print("La persona $nombre es adulto")
        }
    }
}*/

//Forma buena de hacer el ejercicio 1
class cPersona(vnombre: String, vedad: Int){
    var nombre: String =vnombre
    var edad: Int =vedad    //Diferenciar e l valor pasado por parametro,al del nombre del atributo

    init {
        if (nombre.isEmpty() || nombre.isBlank()) nombre= "Nombre Vacio" else nombre.uppercase()
        if (edad<0 || edad >120) edad=0
    }
    fun imprimirme()= when (edad){
        in 0 .. 17 -> "$nombre Persona menor de edad"
        in 17 .. 29 -> "$nombre Persona joven"
        else ->"$nombre persona adulta"
   }


}






/*Ejercicio 2Crear un programa que se solicite los 3 lados de un triangulo y tenga los métodos:
ladoMayor y esEquilatero.
Realice tres constructores para esta clase. Indique siempre que constructor se estáejecutando:
1 constructor principal se le pasa los valores de cada lado (lado1, lado y lado3)
2 constructor no se le pasa ningún valor y solicita el valor de (lado1 y lado2=, lado 3 es el
valor de lado1
 3 constructor se le pase el valor de un solo lado (lado1) e iguale los restantes*/

class Triangulo(var lado1:Float,var lado2:Float,var lado3: Float){
        fun LadoMayor()=when {
            lado1==lado2 && lado1 ==lado3 -> "Los tres lados son iguales"
            lado1 > lado2 && lado1 > lado3 -> "$lado1 es mayor que $lado2 y $lado3"
            lado2 > lado1 && lado2 > lado3 -> "$lado2 es mayor que $lado1 y $lado3"
            else -> "$lado3 es mayor que $lado1 y $lado2"
        }

        fun esEquilatero(){

            (lado1==lado2  && lado2==lado3)
            println("Los tres lados son igual")
        }

    }



/*
Ejercicio3 Crear un programa donde se le pase el nombre de un alumno y un listado de sus 5 notas y
tiene como métodos:
notaPromedio: Calcular el promedio de sus notas
detalleNotas: imprima la cantidad de asignatura por rango de nota.

*/


class Alumno(var nombre: String ,var nota1:Int,var  nota2: Int,var nota3: Int,var nota4:Int,var nota5:Int){

    fun notaPromedio (){
        var nombre=nombre
        var promedio:Int

        promedio=((nota1 +nota2 +nota3 +nota4 +nota5)/5)
        println("Este es el promedio de las $nota1,$nota2,$nota3,$nota4,$nota5")
    }

    fun detalleNotas(promedio:Int) {
        when(promedio){
        9 ,10 ->("Es un sobresaliente")
        7, 8 ->("Es un notable")
        6 ->("Es un bien")
        5 ->("Es un aprobado")
        else ->("Esta suspendido")
    }


    }








}






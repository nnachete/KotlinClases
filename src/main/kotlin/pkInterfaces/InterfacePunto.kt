package pkInterfaces

interface InterfacePunto {
        var x:Int
        var y:Int
        fun imprimir()

    class PuntoPlano(override var x: Int, override  var y:Int):InterfacePunto{
        override fun imprimir() { println("Punto en el plano: ($x,$y)")}}

    class PuntoEspacio(override var x: Int, override  var y:Int,var z:Int):InterfacePunto {
        override fun imprimir() { println("Punto en el espacio: ($x,$y,$z)")}}

}
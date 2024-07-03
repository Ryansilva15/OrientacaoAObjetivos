private class X
open class Eletronico (var marca: String){
    protected fun ativarCorrente(){}
    fun ligar() {}
    fun desligar() {}
}

class Computador (marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}
fun main (){
    var c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
    c.marca

    X()
}
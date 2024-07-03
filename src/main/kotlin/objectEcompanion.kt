class Matematica {
    companion object Nome {
        val PI = 3.1415
        fun teste (){}
        init {
            println("fui inicializado")
        }
    }
    object obj1{
        val PI = 3.1415
        fun teste (){}

        init {

        }
    }
}
fun main (){
    Matematica.PI
    Matematica.PI
    Matematica.PI
}
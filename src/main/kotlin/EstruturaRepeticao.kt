fun main() {

    //until()
    //step(2)
    //downTo()
     letters()
    //useforEach()
}


fun until(){
    // until -  conta do valor atual até o valor estabelecido menos 1
    // conta até 19
    for(i in 0 until 20){
        println(i)
    }
}

fun downTo(){
    // downTo -  conta de maneira decrescente
    for(i in 20 downTo 0){
        println(i)
    }
}

fun step(num:Int){
    // step -  determina o intervalo da contagem
    // conta em intervalod determinados pelo num
    for(i in 0..20 step num){
        println("$i")
    }

    var text = "kotlin"
    // imprime um a um todos os caracter do texto
    for(letter in text){
        println(letter)
    }

}


// trabalhando com Array
fun useforEach(){
    val sArray = "Olha essa string!"
    // imprime cada caracter da string sArray separado por espaço
    sArray.forEach{ l -> print(l + " ")
    }
}

fun letters(){
    val sArray = "Olha essa string!"
    for(l in sArray){
        print(l.toUpperCase())
    }
}
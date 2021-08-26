import java.lang.NumberFormatException

const val MULTIPLICACAO = "1 - Multiplicação"
const val SOMA = "2 - Soma"
const val SUBTRACAO = "3 - Subtração"
const val DIVISAO = "4 - Divisão"
const val RESTO = "5 - Resto"

fun main(){
    val (valor1: Float?, valor2: Float?) = entradaValores()

    when(menuOperacao()){
        1 -> multiplicacao(valor1, valor2)
        2 -> soma(valor1, valor2)
        3 -> subtracao(valor1, valor2)
        4 -> divisao(valor1, valor2)
        5 -> resto(valor1, valor2)
    }


}

private fun multiplicacao(valor1: Float?, valor2: Float?) =  println(valor1!!.times(valor2!!))
private fun soma(valor1: Float?, valor2: Float?) = println(valor1!! + valor2!!)
private fun subtracao(valor1: Float?, valor2: Float?) = println(valor1!! - valor2!!)
private fun divisao(valor1: Float?, valor2: Float?) = println(valor1!! / valor2!!)
private fun resto(valor1: Float?, valor2: Float?) = println(valor1!! % valor2!!)


private fun entradaValores(): Pair<Float?, Float?> {

// aceita um float ou null
    var valor1: Float? = null
    var valor2: Float? = null

    do {
        try {

            val pair = inputDados(valor1, valor2)
            valor1 = pair.first
            valor2 = pair.second

        } catch (e: NumberFormatException) {
            messageException(valor1, valor2)
        }

    }while (valor1 == null || valor2 == null)

    return Pair(valor1, valor2)

}

private fun messageException(valor1: Float?, valor2: Float?) {
    if (valor1 == null) {
        println("Digite um numero para valor1!")

    } else if (valor2 == null) {
        println("Digite um numero para valor2!")
    }
}

private fun inputDados(valor1: Float?, valor2: Float?): Pair<Float?, Float?> {
    var valor11 = valor1
    var valor21 = valor2

    if (valor11 == null) {
        print("valor 1:")
        valor11 = readLine()!!.toFloat() // entrada pelo teclado e não nula, !! para erro de referência nula nullPointerException

    } else if (valor21 == null) {
        print("valor 2:")
        valor21 = readLine()!!.toFloat()
    }
    return Pair(valor11, valor21)
}

private fun menuOperacao(): Int {
    var op: Int = 0

    do {
        println(MULTIPLICACAO)
        println(SOMA)
        println(SUBTRACAO)
        println(DIVISAO)
        println(RESTO)

        try {
            // leia a valor digitado pelo usuario
            op = readLine()!!.toInt()

        }catch(e: NumberFormatException){

            println("Digite o número de uma opção abaixo:")
        }

    } while (op == 0)

    return op
}
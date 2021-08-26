
// const val servem para declarar variaveis constantes e devem ser definidas fora da
// função
const val MIN_AGE = 16
const val MAX_AGE = 68
fun main(){
    declaracao_var1()
    declaracao_var2()

}

fun declaracao_var1(){
var currentAge = 22 //(declarando inteiro implicito)

var currentAge_1: Int? // (currenteAge_1 pode receber null ou um int)
currentAge_1 = null  // ou 22 por exemplo

// val Não pode ter o valor alterado
// seu valor é atribuido durante a compilação, muito usado para consulta
val currentAge_3 = 22 // (declarando inteiro implicito)

val currentAge_4: Int? // (declarando inteiro que pode receber um Int ou null)
currentAge_4 = null // ou 22
}

fun declaracao_var2(){

    // Não aceita esse tipo de atribuição - exibe erro
    // var currentAge //ERRO - nao pode saber o tipo
    // currentAge = 22

    // criação e atribuição correta da variavel tipo var
    var currentAge: Int
    currentAge = 90

    var currentYear = "Ano"

    //currentYear = 2021 // ERRO - É do tipo String, não pode receber um Int
    currentYear = 2021.toString() + " vai ser melhor"; // aceito, há conversão pra string
    println(currentYear)
}

fun declaracao_var_nullability() {
    // Atribui valor null corretamente a month
    // inicia a criação da variavel e já abribui o valor null
    var month: Int? = null

    /* Erro de compilação */
    // var day: Int = null

}
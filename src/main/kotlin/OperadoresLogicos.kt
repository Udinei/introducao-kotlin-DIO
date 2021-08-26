const val MIN_AGE1 = 16
const val MAX_AGE1 = 68

fun main(){
    usandoRangeAndIn_1()
    usandoRangeAndIn_2()
}

fun usandoRangeAndIn_1() {
    val numbers = listOf(3,9,0,1,2)
    // 12 esta contido em numbers = false
    println(12 in numbers)

    // 12 esta no range(faixa) de 0 à 20 = true
    println(12 in 0..20)
}


fun usandoRangeAndIn_2() {
    // age recebe um numero aleatorio entre 10 e 100
    var age = (10..100).random()
    println(age)

    println(age in MIN_AGE1..MAX_AGE1) // age esta dentro da faixa de idade
    println(age >= MIN_AGE1 && age <= MAX_AGE1) // age é maior ou igual a faixa de idade
    println(age >= MIN_AGE1 || age <= MAX_AGE1) // age é maior ou igual a faixa de idade

    println("-----// simulando um bingo //-----")
    val bingo = listOf(8, 6, 34, 2, 13)
    val number = (1..34).random() // atribui um numero aleatorio entre 1 e 34 a number

    println(number) // numero gerado
    println(number in bingo) // o number gerado existe na lista bingo

}
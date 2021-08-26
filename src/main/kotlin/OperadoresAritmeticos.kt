fun main() {
    // declaracao por inferencia de tipo
    val count = 10
    var times = 9
    times += count

    // ERRO - não é possivel alterar o valor da variavel com modificador val
    // val r = times + count
    // println(r)

    println(times)
    println(count.plus(times)) // somando variaveis do tipo Int

    // concatenando strings
    var count1 = "Olá,"
    var times1 = " Mundo"
    println(count1.plus(times1))

}
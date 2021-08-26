fun main(){
 //emptyOrBlanck()
 tamanhoEmptyAndBlanck()
}

fun emptyOrBlanck(){
    val s = ""
    println(s.isEmpty()) // true

    println(s.isBlank()) // true

    println(s.isNullOrBlank() || s.isNullOrEmpty()) // true - pode ser que esteja null ou blanck ou empty

    val s1 = "    "
    println(s1.isEmpty())   // false - é vazia não tem caracter só espaco

    println(s1.isBlank())   // true - espaco é um conteudo branco

}

fun tamanhoEmptyAndBlanck() {
    val empty = ""
    println(empty.length) // tem tamanho zero e vazia

    val blanck = "          "
    println(blanck.length) // tem tamanho maior que zero, e seu conteudo são espaços

    println(empty.isEmpty() && blanck.isBlank()) // blanck e empty sao true,
                                                 // porque pra ser blank tem que ter espaços e
                                                 // e empty tem que estar vazia sem nada

}
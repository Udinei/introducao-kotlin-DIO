fun main(){
    //indexacao()
    //concatenacao()
    concatenacao_1()
}

fun indexacao(){
    val s = "Ola, mundo!"

    // imprime O
    println(s[0]) // acessando pelo indice o caracter da string
    println(s.first()) // usando o metodo

    // imprime !
    println(s[s.length-1]) // access for indice
    println(s.last()) // acess for method

}

fun concatenacao() {
    val name = "Ana" // por inferencia uma string
    val s = "Olá"

    //imprime OláAna usando +
    println(s + name)

    // imprime Olá, Ana! usando a formatação da string "${varName}"
    println("${s}, ${name}!")

    // imprime Bem vinda(o), Ana!
    println("Bem vinda(o), ${name}!")

}

fun concatenacao_1() {
    val welcome = "Bem vinda(o)"
    val name = "luisa"
    println("$welcome, ${name.capitalize()}!")// capitalize, primeira letra da string em maiuscula
                                              // "$variavel , ${variavel.method}"
}

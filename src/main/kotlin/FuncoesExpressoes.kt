fun main(){
    println(getFullName("Udinei","Silva"))
    println(getFullName_1("Jose","Roberto"))
}

private fun getFullName(name:String, lastName:String):String{
    val fullname = "$name $lastName" // colacando em uma variavel
    return fullname // retornando o valor da variavel
}


private fun getFullName_1(name:String, lastName:String):String{
    return "$name $lastName" // retornando a string direto
}

// Single line function
private fun getFullName_2(name:String, lastName:String) = "$name $lastName"
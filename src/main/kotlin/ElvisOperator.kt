fun main() {
    var x:Int? = null
    var w:Int? = null
    var j:Int? = null

    avaliacaoAluno()
    retornaNullSeJNull(j)
    retornaStringSeNull(j)
    retornaT(x,w,j)
    forcaChamadaDeJIgualNullRetornaException(j)

}

fun retornaT(x:Int?, w:Int?, j:Int?){
    var t:Int
    // se x = null,então atribua w, se w = null
    // então atribua j se j = null então atribua -1
    t = x ?: w ?: j ?: -1
    println("Valor de t: $t")
}

fun forcaChamadaDeJIgualNullRetornaException(j:Int?) {
// !! força a chamada da função mesmo j sendo null, retorna um nullpointexception
    var s3: String? = j!!.getStudentStatus()
    println("Valor de s3: $s3")
}

fun retornaNullSeJNull(j:Int?){
// se j nao foi informado valor retorna null, porque s2 aceita null
var s2:String? = j?.getStudentStatus()
 println("Valor de s2: $s2")
}

fun retornaStringSeNull(j:Int?){
    // se j for null, retorne o segundo operando do elvis "" porque s1 não aceita null
    var s1:String = j?.getStudentStatus() ?: "dd"
    println("Valor de s1: $s1")
}

private fun avaliacaoAluno() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())
}

// Extension function - aceita somente inteiros como entrada, que será representada por this
// j.getStudentStatus - j deve ser um inteiro
fun Int.getStudentStatus():String{

    println("nota $this")

    // caso o valor This esteja na faixa informada
    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}
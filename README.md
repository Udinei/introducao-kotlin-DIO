# Introdução Kotlin

A linguagem Kotlin e suas aplicabilidades
Fundamentos básicos do desenvolimento Android
Sintaxe básica da linguagem Kotlin

## Idéias de criação do Android

- Desde de 2005 - A Google mantém
- Industria deseja  ter um sistema operacional unificado
- Remover coisas e incluir 
- Familiaridade em interação
- 24 mil modelos de dispositivos
- Android é encontrado em Tvs,  Geladeiras, Carros, Espelhos inteligentes etc..
- Milhares de usuários
- Android 11/12

## Curiosidades

- Android 3.0(Honeycomb) unica versão pra tablets e celulares
- Versão ice cream sandwich grande adesão
- Mais de 2 milhões de apps na google pay
- Brasil 85% dos usuários afirmam que seu primeiro smartphone foi um Android
- Absorvido por vários fabricantes
- Desenvolvimento hibrido x nativo

- Hibrido Gera um app  para várias plataformas
- Utiliza cada aplicacão em casos diferentes
- Java, kotlin, Dart, javascript e C# (usam caracteriscas de sistema hibridos)
- Nativo - Gera uma versão para um OS especifico
- Documentação vasta
- Primeiro passos
- Kotlin first

### O que é Kotlin

- Criada pela jetBrains 2011 mantido pela kotlin foundation
- Linguagem multiplataforma, orientada a objetos e funcional
- Programação funcional
- Gratuito e de código aberto
- Nome em homenagem a ilha russa Kotlin
- Facilitou o contato com a comunidade
- Ver o que comunidade esta falando
- Usar o hibrido e o nativo para crescer profissionalmente

### Estrutura basica da linguagem

- Não utiliza ponto e virgula
- Não possui operador ternário tradicional
- Type safe e null safe - evita erros durante a execução
- Inferência de tipo
- e muito mais

### Aplicabilidade

- Android nativo
- Mobile multiplataforma (KMM) kotlin e mobile 
- Frontend Web com Kotlin/JS
- Frameworks ex: Kvison e Fritz2
- Backend com target node.js do Kotlin/JS

### Vantagens

- Segura, estruturada, menos verbosa, mais otimizada
- Grande relevância no mercado
- Interoperabilidade com o Java (app em java e kotlin)
- Smart casts e null safety (Conversas(Smart),Safety (segurança) )
- Android é Kotlin first ()

### Kotlin + Android

- 2016 - 1º Versao estável kotlin
- 2017 - Google anuncia suporte a kotlin para dev Android
- 2018 - Segunda linguagem preferida dos desenvolvedores
- 2019 - Google anuncia que kotlin é a nova linguagem oficial para desenv. Android 
- O Java continua funcionado e interoperavél com kotlin
- Java não é mais a prioridade
- Todos os recursos do Java é compativel com kotlin até AndroidX
- Equivalência de códigos Java pra Kotlin de Kotlin pra Java
- Visual studio faz conversão de Java pra Kotlin de Kotlin pra Java

### Resumo Kotlin 

- É a linguagem oficial para Android
- Em desenvolimento desde 2011
- Possui diversas vantagens como null check e type safe
- É 100% interoperável com java
- também desenvolve frontend e backend com kotlin/JS e multiplataformas com KMM



# Kotlin sintaxe básica

Codificação prática online na web no site playground 
https://play.kotinlang.org

### Tipos de dados

- Int
- Long
- Float
- Double
- Array
- Boolean
- Char
- Byte
- Short
- Null

##### Consultando o valor máximo que um tipo de dados pode ter

println(Int.MAX-VALUE)

println(Foat.MAX-VALUE)

println(Long.MAX-VALUE)

println(Byte.MAX-VALUE)

println(Short.MAX-VALUE)

### Conversão de tipos de dados

toByte()

toShort()

toInt()

toLong()

toFloat()

toDouble()

toChar()

### Declaração de variaveis no kotlin

inicia sempre com letra minuscula 

- var (valor mutável, CamelCase)
    Variável que pode ter seu valor alterado durante o código e durante a execução
	
- val (valor imutável, CamelCase)
  pode ser criada e depois atribuir o valor variável que terá somente um valor atribuido e esse 
  valor e definido durante a execução
  (similiar ao final em Java)
  
- const val (valor imutável, SNAKE_CASE) (Todo em maiúsculo separados por _ )
  Constante cujo valor é atribuido durante compilação somente pode ser consultado

### Declarando as variáveis

  Codificando online site (possui limitação de uso de alguns recursos): https://play.kotinlang.org

### Exemplo de código

- Kotlin não tem típagem dinâmica, sua típagem é estática
-  Uma variável não pode ser declarada sem tipo e sem atribuição
-  Uma variável com inferência de tipo só receberá valores do mesmo tipo que a sua primeira atribuição
- Pode se usado em vários lugares no código

```
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
```

  

### Nullability

Qualquer tipo pode ser nulo, porém isso deve ser explicitado na declaração de
variável através do uso da interrogação(?)

A inferência de tipo não atribui nullability;

```
fun declaracao_var_nullability() {
    // Atribui valor null corretamente a month
    // inicia a criação da variavel e já abribui o valor null
    var month: Int? = null

    /* Erro de compilação */
    // var day: Int = null

} 
```



### Operadores Aritméticos

Os operadores podem ser chamado tanto como expressão quanto como comando, o resultado será o mesmo.

| Função        | Expressão | Comando    | Atribuição |
| ------------- | --------- | ---------- | ---------- |
| soma          | a + b     | a.plus(b)  | a +=b      |
| subtração     | a - b     | a.minus(b) | a -=b      |
| multiplicação | a * b     | a.times(b) | a *=b      |
| divisão       | a / b     | a.div(b)   | a /=b      |
| resto         | a % b     | a.mod(b)   | a %=b      |

Nota: A função soma também funciona para concatenar Strings

​    

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


### Operadores comparativos

- Os comandos **compareTo** retornam os valores **-1**(menor que), **0**(igual), ou **1**(maior)).

- Já os **operadores**(< ,  >,  >=, <=, ==, !=) retornam valores booleanos

- o comando **equals** retorna um booleano

| Função            | Expressão       | Comando                                  |
| ----------------- | --------------- | ---------------------------------------- |
| maior/menor       | a > b ou a < b  | a.compareTo(b) > 0 ou a.compareTo(b) < 0 |
| maior/menor igual | a >=b ou a <= b | a.compareTo(b) >=0 ou                    |
| igual             | a == b          | a.equals(b)                              |
| diferente         | a != b          | !(a.equals(b))                           |



### Operadores lógicos && e ||

Quando utiliza-se o comando, é recomendado colocar a expressão entre parênteses

| Função e expressão | Comando                        |
| ------------------ | ------------------------------ |
| e, and (&&)        | (expressão1) && (expressão2)   |
| or, Ou (\|\|)      | (expressão1) \|\| (expressão2) |



### Operadores In e range

Se o valor está presente em uma lista ou uma faixa (range) de valores
Range cria um intervalo de valores que inicia no primeiro parâmetro e acaba no segundo

**In** - o valor esta contido no conjunto

in - contém 

!in - não contém


**Range**  - faixa de valores
int..int - um inteiro inicial e um inteiro final		 

### Exemplo de código

```
fun main(){
    usandoRange()
}

fun usandoRange() {
    val numbers = listOf(3,9,0,1,2)
    // 12 esta contido em numbers = false
    println(12 in numbers)

    // 12 esta no range(faixa) de 0 à 20 = true
    println(12 in 0..20)
}
```



```
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
```



### Manipulação de Strings

- Strings possuem diversos métodos associados 
- Indexação, concatenação, comparação, formatação
- Pode ser concatenada com plus/+
- Também é tratada como um array de Char, String com array
- Métodos mais utilizados - First(), last(), String.length(), String[index]

### Indexação

```
val s = "Ola, mundo!"

println(s[0])
println(s.first())
// imprime o

println(s[s.length-1])
println(s.last())
// imprime !
```



### Concatenação

- Para concatenar duas strings o plus/+ pode ser utilizado

- Para concatenar uma variável a uma String, os símbolos ${} devem ser inseridos

  ```
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
  ```

  

```
fun concatenacao_1() {
    val welcome = "Bem vinda(o)"
    val name = "luisa"
    println("$welcome, ${name.capitalize()}!")// capitalize, primeira letra da string em maiuscula
                                              // "$variavel , ${variavel.method}"
}
```

### Formatação

| Nome                       | Função                                                       | Métodos                                                      |
| -------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Capitalização de Strings   | Alterar a formatação entre letras minúsculas e maiúscula     | capitalize(),  toUpperCase(), toLowerCase(), and decaptalize |
| Remoção de espaços         | Remove espaços vazios e caracteres inadequados para impressão | trimEnd(), trimStart(), trim()                               |
| Substituição de caracteres | Substituir  um caracter por outro                            | replace(x, y)                                                |
| Formatação                 | Formatar outros valores para um padrão de string             | "padrão ${valor}".format(valor)"                             |

​              

### Empty x Blank

Métodos de comparação, a  String está vazia, em branco ou é nula?

- Se o tamanho da string (s.length) for 0 esta empty e blank (esta vazia e nula)
- Se o tamanho for > 0 mas todos caracteres são espaços em branco, esta blank mas não empty (há espaços)

```
fun main(){
 emptyOrBlanck()
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
```



Evita validação de conteúdo na mão

```

fun tamanhoEmptyAndBlanck() {
    val empty = ""
    println(empty.length) // tem tamanho zero e vazia

    val blanck = "          "
    println(blanck.length) // tem tamanho maior que zero, e seu conteudo são espaços

    println(empty.isEmpty() && blanck.isBlank()) // blanck e empty sao true,
                                                 // porque pra ser blank tem que ter espaços e
                                                 // e empty tem que estar vazia sem nada

}
```



### Função e expressão

- Prefixo fun nomeFuncao(nomeParametro: Tipo): TipoRetornoFuncao{ }

- Funções anônimas, single-line, inline, extensões, lambdas de ordem superior

- Funções tipo void, não precisa colocar o :TipoRetorno

- Funções sem paramêtros (colocar somente os parentêses em branco) 

   ex: `private fun nomeDafuncao(){}`

```
private fun getFullName(name:String, lastName:String):String{
    val fullname = "$name $lastName" // colacando em uma variavel
    return fullname // retornando o valor da variavel
}
```



Simplificando a função

```
private fun getFullName_1(name:String, lastName:String):String{
    return "$name $lastName" // retornando a string direto
}
```



### Single line function

- Prefixo fun nomeDaFuncao(nome:Tipo) = retorno;
- Função de uma única linha;
- Infere o tipo de retorno;
- Usado na simplificação de funções

A mesma função acima mas escrita em uma única linha

```
private fun getFullName(name:String, lastName:String) = "$name $lastName"
```



### Funções de ordem superior 

- Recebem outra função ou lambda por parâmetro
- Bastante úteis para a generalização de funções e tratamento de erros

```
/** Ex: de funcao de primeira ordem, que podem receber outra função ou lambda por parametro
    evita validação de conteudo na mão
    Bastante úteis para a generalização de funções e tratamento de erros
 */
    fun main() {
        val x:Int
        val z:Int

        x = calculate(35, 90,::soma)
        z = calculate(34, 90){a,b -> a*b
                                       println("Vou calcular!")
                                       a+b // a ultima linha deve ser do tipo do retorno da funcao um Int
                                      }

          println("Valor de x = $x")
          println("Valor de y = $z")
    }

    fun soma(a1:Int, a2:Int) = a1.plus(a2) // funcao abreviada

    fun calculate(n1:Int, n2:Int, operation:(Int, Int) -> Int):Int{
        val result = operation(n1, n2)
        return result
    }
```





### Funções/Extensões

- Prefixo `fun Tipo.nomeFuncao()`;
- Cria uma função que só pode ser chamadad por um tipo especifico, cujo o valor pode ser referenciado
dentro da função através da palavra `this`;

`fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()`

ex: no kotlin: `toString, toLowerCase`

### Estruturas de controle

`if/else, when, elvis operator`

- Pode ser utilizado tanto para controle quanto para atribuição
- Pode ser encadeado com múltiplas estruturas

```

fun main(){
    
val expressao = true
if(expressao){
    // bloco de codigo

}else if(expressao) {
    // bloco de codigo
}else {
        // bloco de codigo
}
val case1 = true
val case2 = true
val case3 = true
    
  when {
        case1 -> {
        }
        case2 -> {
        }
        case3 -> {
        }
        else -> {
        }
    }

    // criação e inicialização de variavel tipo Int com valor null
    val a: Int? = null    
    
    // criação e inicialização da variavel number com elvis operator, que vai atribuir zero se a for null
    var number = a ?: 0   
}
```




### Atribuição

- O valor atribuído tem que esta na última linha do bloco

- A condicional pode não usar chaves se só fizer a atribuição

- Expressão em uma única linha 
  `val maxValue = if (a > b) a else if (a < b) b else b`

  Equivalente ao código acima

  ```
  val minValue = if (a > b){
     println("b ($b) é o menor valor")
     b
   }else if(a < b){
     println("a($a) é o menor valor")
     a
   } else {
     println("Os valores são iguais")
     b
   }
  ```

  

### When

- Equivalente ao switch de outras linguagens;
- Aceita tanto valores quanto condicionais
- Aceita range como case;
- Obrigatoriamente tem que ter um claúsula else, se nenhuma opção for verdadeira

```
when {
 a > b -> {}
 a != b && a > c -> {}
 b == 0 -> {}
 else -> {}
 }

var year = 720 
when(year){       // somente um tipo pode ser usado na comparação
 -4000..475  -> {} // Antiguidade
 476..1452   -> {} // Medieval
 1453..1789  -> {} // Moderna
 currentYear -> {} // Ano atual
```

### Elvis operator 

O Operador Elvis é representado por um ponto de interrogação seguido de dois pontos ( ?: ) e pode ser usado com esta sintaxe:

`first operand ?: second operand`

Ele permite que você escreva um código consistente e funciona como tal:

Se first operand não for nulo , ele será retornado. Se for nulo , o second operand será retornado. Isso pode ser usado para garantir que uma expressão não retorne um valor nulo, pois você fornecerá um valor não anulável se o valor fornecido for nulo.

Exemplo (em Kotlin):

```
fun retrieveString(): String {    //Notice that this type isn't nullable
    val nullableVariable: String? = getPotentialNull() //This variable may be null
    

    return nullableVariable ?: "Secondary Not-Null String"

}
```

Nesse caso, se o valor calculado de `getPotentialNullnão` for nulo, ele será retornado por `retrieveString`; Se for nulo, a segunda expressão `"Secondary Not-Null String"`será retornada.

Observe também que a expressão do lado direito é avaliada apenas se o lado esquerdo for nulo .

No Kotlin, você pode usar qualquer expressão como `second operand`, como uma throw Exception expressão

`return nullVariable ?: throw IllegalResponseException("My inner function returned null! Oh no!")`

O nome Elvis Operator vem do famoso cantor americano Elvis Presley .

 Seu penteado lembra um ponto de interrogação  Fonte: https://qastack.com.br/programming/48253107/what-does-do-in-kotlin-elvis-operator
LeoColman

- mais próximo do operador ternário
- Verifica se um valor é nulo e apresenta uma opção caso seja 
- Pode ser encadeado

No caso: 

```
var number = a?: b?: 0 
```

se o valor de a não for nulo, number recebe a.
Se o valor de a for nulo e b não for nulo, number recebe b
se a e b forem nulos, number recebe 0

**Em outras palavras** : Se a não for nulo number recebe a, senão se b não for nulo number recebe b, caso contrário number recebe 0

Evita validação de conteúdo na mão

```
fun main() {
   val grade = (0..10).random()
   //println(grade.getStudentStatus())

   var t:Int
   var x:Int? = null
   var w:Int? = null
   var j:Int? = null 
   //var s:String = j?.getStudentStatus()?: "" // forma 1 da variavel tambem aceitar valor nll
   var s:String? = j?.getStudentStatus()       // forma 2 da variavel tambem aceitar valor nll
   // var s:String? = j!!.getStudentStatus()   // !! força a chamada da função mesmo o valor 
                                               // sendo null, retorna um nullpointexception

   t = x?:w ?:j ?: -1 // se x = null,então atribua w, se w = null
                      // então atribua j se j = null então atribua -1
                      
   // s = j?.getStudentStatus()

   //println(t) 
   println(s) 
    

}
```



### Extension function 

`fun Int.getStudentStatus():String{ }`

```
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
```



### Repetição

- `While, do..while, for e forEach`
- Estruturas similares às convencionais em outras linguagens
- Aceita os comandos `in, range, until, downTo e step`

```
while(condição){
}

do {
  // bloco

}while(Condição)

for(i in 0..20 step 2){
  println(i)
}
```


for(variavelIndexadora in/until/downTo faixa de valores/condicional step intervalo)

In -  conta do valor inicial até o valor final estabelecido
until -  conta do valor atual até o valor estabelecido menos 1
downTo -  conta de maneira decrescente
step -  determina o intervalo da contagem

```
for(i in 0..20 step 2){
  println(i)
}  

for(i in 0 until 10){
  println(i)
}

for(i in 10 downTo 0){
  println(i)
}  

var text = "kotlin"
for(letter in text){
   println(letter)
}
```



##### Exemplos de código com until, step, downTo e forEach

```
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
```



#### Trabalhando com array

```
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
```





### Exercícios criando calculadora kotlin

```
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
```
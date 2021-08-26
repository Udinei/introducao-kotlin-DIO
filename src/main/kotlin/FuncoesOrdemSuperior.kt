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
val Moradores = listOf(
    Inquilinos("Lineker", 1),
    Inquilinos("Fatima", 3),
    Inquilinos("Pedro", 6)
)
val Valores = ContasCond(233.57, 33.52, 50)

fun main() {
    println("Valor da agua: ${Valores.vAgua} ; Valor do luz: ${Valores.vLuz} \n")

    val TotalPessoas = CalcularNumeroTotalPessoas()
    val vPessoa = (Valores.vAgua + Valores.vLuz) / TotalPessoas
    for (Morador in Moradores){
        val TotalPagar = (Morador.nPessoas * vPessoa) + Valores.vTaxa

        println("${Morador.nome} Vai pagar: $TotalPagar")

    }
}
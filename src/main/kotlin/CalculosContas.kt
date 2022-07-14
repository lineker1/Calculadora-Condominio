fun CalcularNumeroTotalPessoas () : Int {
    var TotalPessoas = 0
    for (Morador in Moradores){
        TotalPessoas += Morador.nPessoas
    }
    return TotalPessoas
}

data class ContasCond (
    val vAgua: Double,
    val vLuz: Double,
    val vTaxa: Int = 30,
)
data class Inquilinos(
    val nome: String,
    val nPessoas: Int,
)
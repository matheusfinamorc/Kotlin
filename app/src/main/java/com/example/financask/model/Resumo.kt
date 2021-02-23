package com.example.financask.model

import java.math.BigDecimal

class Resumo(private val transacoes: List<Transacao>) {

    val receita get() = somaPor(Tipo.RECEITA)

    val despesa get() = somaPor(Tipo.DESPESA)

    val total get() = receita.subtract(despesa)


    private fun somaPor(tipo: Tipo): BigDecimal{
        val somaDeTransacoesPeloTipo = transacoes
                .filter { transacao -> transacao.tipo == tipo } // filtra as transaçoes para o tipo receita
                .sumByDouble { transacao -> transacao.valor.toDouble() } // soma as transações
        return BigDecimal(somaDeTransacoesPeloTipo)
    }
}

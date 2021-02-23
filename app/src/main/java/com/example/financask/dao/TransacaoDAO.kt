package com.example.financask.dao

import com.example.financask.model.Transacao

class TransacaoDAO {

    val transacoes: List<Transacao> = Companion.transacoes // permite acesso aos membros de fora

    companion object{ // para salvar de modo estatico e assim, nao apagar os dados quando mudar o modo (paisagem - retrato)
        private val transacoes: MutableList<Transacao> = mutableListOf()
    }

    fun adiciona(transacao: Transacao){
        Companion.transacoes.add(transacao)
    }

    fun altera(transacao: Transacao, posicao: Int){
        Companion.transacoes[posicao] = transacao
    }

    fun remove(posicao: Int){
        Companion.transacoes.removeAt(posicao)
    }

}
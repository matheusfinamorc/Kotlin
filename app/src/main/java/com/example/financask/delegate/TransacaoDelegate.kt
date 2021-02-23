package com.example.financask.delegate

import com.example.financask.model.Transacao

interface TransacaoDelegate {

    fun delegate(transacao: Transacao)
}
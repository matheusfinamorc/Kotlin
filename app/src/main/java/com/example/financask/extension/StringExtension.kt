package com.example.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun String.limitaEmAte(caracteres: Int): String{
    if(this.length > caracteres){
        // o uso do " $ " garante que o caracter será imprimido
        val primeiroCaracter = 0
        return "${this.substring(primeiroCaracter, caracteres)}..." // define o limite de caracteres da palavra
    }
    return this
}

fun String.converteParaCalendar(): Calendar {
    val formatoBrasileiro = SimpleDateFormat("dd/MM/yyyy")
    val dataConvertida = formatoBrasileiro.parse(this)
    val data = Calendar.getInstance()
    data.time = dataConvertida
    return data
}
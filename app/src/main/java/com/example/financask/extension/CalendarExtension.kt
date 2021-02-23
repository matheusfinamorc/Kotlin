package com.example.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataParaBrasileiro(): String{              // essa funcao fica dentro do Calendar
    val formatoBrasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBrasileiro)
    val dataFormatada = format.format(this.time)
    return dataFormatada
}
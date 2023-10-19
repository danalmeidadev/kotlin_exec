package com.example.ebac_exe_02

fun verificaParOuImpar(num: Int): String {
    return when(num % 2){
        0 -> "Par"
        1 -> "Impar"
        else -> "Informe um número inteiro"
    }
}

class par_ou_imapr {

}

fun main() {
    val numero: Int = 7
    val resultado = verificaParOuImpar(numero)
    println(resultado)
}
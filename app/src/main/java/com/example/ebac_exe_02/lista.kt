package com.example.ebac_exe_02

class lista {
}

fun main() {
    var array: IntArray = IntArray(39){it + 1}
    for (numbers in array  ){
        println(numbers)
    }

    var arrayNumbers: IntArray = IntArray(99){it+ 1}
    for (numbersInt in arrayNumbers){
        print(numbersInt)
    }

    var soma = 0
    for (element in array){
        soma += element
        println(soma)
    }
}
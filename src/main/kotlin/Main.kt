fun main() {

//    1 - Faça um algoritmo que leia os valores de A, B, C
//    e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.


    println("Digite um valor na tela \n")
    val a = readln().toInt()

    println("Digite o segundo valor na tela \n")
    val b = readln().toInt()

    println("Digite o terceiro valor na tela \n")
    val c = readln().toInt()

    val soma = a + b

    println("O valor da soma entre valor A e valor B é $soma ")

    if(soma < c){
        println("O valor da soma é menor que C")
    }else{
        println("O valor da soma é maior q")
    }


}
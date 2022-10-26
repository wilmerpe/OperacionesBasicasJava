package com;


import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        //El sistema Scanner en este caso lo utilizamos para pedir al usuario un valor
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, resultadoSuma;

        System.out.println("Escribe 3 números: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        resultadoSuma = nota1 + nota2 + nota3;
        System.out.println("\nLa suma es: " + resultadoSuma);
    }
}

 /*
        Los operadores de suma,resta,multiplicación, división y el resto de una división son de esta manera en
        el lenguaje Java:
        Suma = +
        Resta = -
        Multiplicación = *
        División = /
        Resto = %
         */

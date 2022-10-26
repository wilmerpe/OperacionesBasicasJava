package com;


import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa em Java que solicita 10 números ao usuário, 
        através de um laço while, e ao final mostre qual destes números é o maior.*/
        Scanner input = new Scanner(System.in);
        int numero, contador = 1, maior = Integer.MIN_VALUE;

        System.out.println("Digite 10 números:");

        while (contador <= 10) {
            System.out.print("Número " + contador + ": ");
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número digitado foi: " + maior);

    }

}

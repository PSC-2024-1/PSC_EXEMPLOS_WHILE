/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex01;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /*Faça um programa em Java para imprimir todos os 
        números ímpares menores que 20.*/
        int i = 1; // inicia com o primeiro número ímpar
        while (i < 20) {
            if (i % 2 != 0) { // verifica se o número é ímpar
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

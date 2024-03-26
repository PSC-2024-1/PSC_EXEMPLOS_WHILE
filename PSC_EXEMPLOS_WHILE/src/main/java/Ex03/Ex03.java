/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa em Java que recebe um inteiro positivo do
        usuário e exibe a música inteira na tela, onde o inteiro recebido 
        representa o número inicial n de patinhos que foram passear.*/ 
        Scanner input = new Scanner(System.in);
        int n, patinhos;

        do {
            System.out.println("Digite o número inicial de patinhos: ");
            n = input.nextInt();
        } while (n <= 0);
        patinhos = n;
        // loop para cantar a música até que nenhum patinho volte
        
        while (patinhos > 0) {
            System.out.print("\n"+patinhos + (patinhos == 1 ? " patinho foi passear\n" : " patinhos foram passear\n"));
            System.out.print("""
                               Além das montanhas
                               Para brincar
                               A mamãe gritou: Quá, quá, quá, quá
                               """);
            // Verifica se ainda há patinhos para voltar
            if (--patinhos > 0) {
                System.out.println("Mas só " + patinhos + (patinhos == 1 ? " patinho voltou de lá.\n" : " patinhos voltaram de lá.\n"));
            } else {
                System.out.println("Mas nenhum patinho voltou de lá.\n");
            }
        }

        // Final da música, onde todos os patinhos voltam
        System.out.print("""
                           A mamãe patinha foi procurar
                           Além das montanhas
                           Na beira do mar
                           A mamãe gritou: Quá, quá, quá, quá
                           """);
        System.out.println("E " + (n == 1 ? "o "+ n + " patinho voltou" :"os "+ n +" patinhos voltaram") + " de lá.");

    }
    
}

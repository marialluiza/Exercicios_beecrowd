/*Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável.
Entrada:
O arquivo de entrada contém 2 valores inteiros.
Saída:
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente 
à soma de A e B. */

import java.util.Scanner;

public class Exer1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, SOMA;

        A = sc.nextInt();
        B = sc.nextInt();

        SOMA = A + B;
        System.out.printf("SOMA = %d%n", SOMA);

        sc.close();
    }    
}

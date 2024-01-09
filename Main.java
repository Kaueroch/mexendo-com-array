/*******************************************************************************
 * 20) Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). Ler um valor
 * maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler
 * novamente). Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo
 * menor.
 *******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int[] valores = new int[3];

       for(int a= 0; a<3; a++){
     System.out.println("digite um valor"+(a+1)+":");
     valores[a] = sc.nextInt();
     while(valores[a] <= 0){
         System.out.println("Erro!Valor inválido");
         System.out.println("Digite um valor válido!"+ (a+1));
         valores[a] = sc.nextInt();
     }
     }
        Arrays.sort(valores);
        System.out.print("Exibe o menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2])+"  E o maior valor dividido pelo menor: "+(valores[2]/valores[0]));

    }
}

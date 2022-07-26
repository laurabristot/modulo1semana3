// Continuando o assunto de fórmula 1, imagine que um campeonato é composto de 10 corridas no total. Escreva um programa que capture as posições de um corredor de fórmula 1 nas 10 corridas do campeonato. O programa deve somar os pontos obtidos pelo corredor a partir de cada posição informada. O programa deve imprimir o total de pontos obtidos pelo corredor.

package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int corrida = 1;
    int points = 0;
    int soma = 0;

    for (corrida = 1; corrida <= 10; corrida++) {
    System.out.println("Em qual posição você ficou na " + corrida + " corrida?");
    int posicao = Integer.parseInt(leitor.nextLine());
      switch (posicao) {
        case 1:
        points = 8;
        break;
        case 2:
        points = 7;
        break;
        case 3:
        points = 6;
        break;
        case 4:
        points = 5;
        break;
        case 5:
        points = 4;
        break;
        case 6:
        points = 3;
        break;
        case 7:
        points = 2;
        break;
        case 8:
        points = 1;
        break;
        default:
        System.out.println("insira uma posição válida");
      }

      soma = soma + points;
  }
  
  System.out.println("Seu total de pontos foi " + soma);
  leitor.close();
}
}

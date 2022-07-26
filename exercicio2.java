// Em uma corrida de fórmula 1, os 8 primeiros colocados ganham pontos para somar no campeonato mundial. O 8º colocado ganha 1 ponto, o 7º colocado ganha 2 pontos, o 6º colocado ganha 3 pontos, e assim sucessivamente, até chegar ao 1º colocado que ganhará 8 pontos. Escreva um programa que capture a posição de um corredor de fórmula 1. A posição deve ser capturada como um número inteiro. O programa deverá pontuar o corredor conforme a posição informada por ele. O programa deve mostrar na tela a quantidade de pontos obtidos na corrida.

package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual foi a sua colocação na corrida?");
    int position = Integer.parseInt(leitor.nextLine());

    switch (position) {
      case 1:
      position = 8;
      break;
      case 2:
      position = 7;
      break;
      case 3:
      position = 6;
      break;
      case 4:
      position = 5;
      break;
      case 5:
      position = 4;
      break;
      case 6:
      position = 3;
      break;
      case 7:
      position = 2;
      break;
      case 8:
      position = 1;
      break;
      default:
      System.out.println("insira uma posição válida");
    }
    System.out.println("Sua pontuação foi " + position + " pontos");
    leitor.close();
    System.out.println("Fim do programa");
  }
}

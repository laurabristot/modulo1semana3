// ano é dividido em quatro estações: Verão, outono, inverno e primavera. Escreva um programa que capture a estação do ano atual do usuário. O usuário deve informar a estação do ano como um número inteiro, a saber:
// -Se o usário informar o número 1, significa verão.
// -Se o usuário informar o número 2, significa outono.
// -Se o usuário informar o número 3, significa inverno.
// -Se o usuário informar o número 4, significa primavera.
// Após o programa capturar a estação do ano do usuário como um número inteiro, o programa deve imprimir na tela o nome da estação correspondente ao número digitado pelo usuário.

package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Qual a estação atual?  1 - Verão    2 - Outono    3 - Inverno    4 - Primavera");
    String resposta = leitor.nextLine();

    switch (resposta) {
      case "1":
      System.out.println("Verão");
      break;
      case "2":
      System.out.println("Outono");
      break;
      case "3":
      System.out.println("Inverno");
      break;
      case "4":
      System.out.println("Primavera");
      break;
      default:
      System.out.println("Insira um número válido");
    }
    
    
    leitor.close();
    System.out.println("Fim do programa");
  }
}

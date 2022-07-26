// Uma empresa precisa criar um relatório com o perfil dos seus colaboradores. Escreva um programa que capture do usuário o perfil de 30 colaboradores. O programa deve capturar o nome, a idade, o sexo e o tempo de casa de cada colaborador. Após capturar os dados dos 30 colaboradores, o programa deve imprimir na tela:
// A quantidade de colaboradores do sexo feminino.
// A quantidade de colaboradores do sexo masculino.
// O colaborador com maior tempo de casa.


package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int maisTempoDeCasa = Integer.MIN_VALUE;
    String colaboradorMaisTempoDeCasa = "";
    int feminino = 0;
    int masculino = 0;

    for (int contador = 1; contador <= 30; contador++) {
      System.out.println("Digite seu nome");
			String nome = leitor.nextLine();
      System.out.println("Informe seu gênero no formato f/m:");
			String genero = (leitor.nextLine());
        switch (genero) {
          case "f":
          feminino = feminino+1;
          break;
          case "m":
          masculino = masculino+1;
          break;
          default:
          System.out.println("insira um genero válido");
          genero = leitor.nextLine();
        }
      
      System.out.println("Digite quantos anos você tem de casa");
			int tempo = Integer.parseInt(leitor.nextLine());
        while (tempo < 0) {
          System.out.println("Seu tempo de casa não pode ser negativo");
          tempo = Integer.parseInt(leitor.nextLine());
        }
       
        if (tempo > maisTempoDeCasa) {
          maisTempoDeCasa = tempo;
          colaboradorMaisTempoDeCasa = nome;
        }

    }

    System.out.println("A quantidade de colaboradores do sexo feminino é " + feminino);
    System.out.println("A quantidade de colaboradores do sexo masculino é " + masculino);
    System.out.println("O colaborador com maior tempo de casa é " + colaboradorMaisTempoDeCasa + " com " + maisTempoDeCasa + " anos!" );

    leitor.close();
  }
}

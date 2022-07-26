// Uma empresa está fazendo um processo seletivo para contratar colaboradores nos seguintes cargos: Desenvolvedor, Analista de sistemas, Testador e Analista de RH.
// Escreva um programa que capture o nome, o cargo e o status do candidato, ou seja, se foi aprovado ou não. O programa deve capturar os dados de 50 candidatos.
// Ao final, o programa deve imprimir:
// A quantidade de candidatos aprovados por cargo de forma individual.
// O número de candidatos aprovados no total, de forma geral.
// O número de candidatos reprovados.


package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int desenvolvedor = 0;
    int analistaSist = 0;
    int testador = 0;
    int analistaRH = 0;
    int reprovados = 0;
    
    for (int candidato = 1; candidato <= 50; candidato++) {
      System.out.println("Informe o nome do candidato:");
      String nome = leitor.nextLine();
      System.out.println("Informe o cargo desejado: Desenvolvedor, Analista de sistemas, Testador ou Analista de RH");
      String cargo = leitor.nextLine().toUpperCase();
      System.out.println("O candidato foi aprovado? s / n");
      String status = leitor.nextLine();
      if (status.equals("s")) {
        switch (cargo) {
          case "DESENVOLVEDOR":
          desenvolvedor = desenvolvedor +1;
          break;
          case "ANALISTA DE SISTEMAS":
            analistaSist = analistaSist +1;
            break;
            case "TESTADOR":
            testador = testador+1;
            break;
            case "ANALISTA DE RH":
            analistaRH = analistaRH+1;
            break;
          } } else {
            reprovados = reprovados + 1;
          }
        }
        
        int totalAprovados = desenvolvedor + analistaSist + testador + analistaRH;
        
        System.out.println("Foram aprovados " + desenvolvedor + " candidatos para o cargo de Desenvolvedor.");
        System.out.println("Foram aprovados " + analistaSist + " candidatos para o cargo de Analista de Sistemas.");
        System.out.println("Foram aprovados " + testador + " candidatos para o cargo de Testador.");
        System.out.println("Foram aprovados " + analistaRH + "candidatos para o cargo de Analista de RH.");
        System.out.println("No total, foram " + totalAprovados + " candidatos aprovados!");
        System.out.println("No total, foram " + reprovados + " candidatos reprovados!");
        leitor.close();
    }




  }


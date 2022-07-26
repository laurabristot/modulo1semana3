// Um professor de educação física quer montar um time de vôlei em uma escola. Para isso, o professor estabeleceu alguns prerrequisitos:
// O time deve ser composto por estudantes com idade acima de 15 anos.
// O time deve ser composto por pessoas do sexo feminino.
// O time deve ser composto por 6 estudantes.
// Escreva um programa que capture o nome, a idade e o sexo de cada estudante da escola. O programa deve parar de capturar as entradas quando houver 6 pessoas no time. Para cada candidato aprovado, o programa deve mostrar o nome da estudante aprovada, bem como o número de pessoas aprovadas até o momento.

package modulo_1_semana_3;

import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    for (int time = 0; time < 6;) {
      
      System.out.println("Digite seu nome");
      String nome = leitor.nextLine();
      System.out.println("Digite sua idade");
      int idade = Integer.parseInt(leitor.nextLine());
      System.out.println("Digite seu sexo [ f/ m ]");
      String sexo = leitor.nextLine();
      
      if (sexo.equalsIgnoreCase("f") && idade >= 15) {
        System.out.println("Parabéns, " + nome +". Você pode fazer parte do time");
        time = time + 1;
      } else if (sexo.equalsIgnoreCase("f") && idade <= 15) {
        System.out.println("Você não está com idade para participar do time");
      } else if (sexo.equalsIgnoreCase("m") && idade > 15) {
        System.out.println("Só aceitamos pessoas do sexo feminino");
      } else {
        System.out.println("Você não tem nem idade e nem sexo para participar.");
      }
      System.out.println("O número de pessoas aprovadas no time até agora é de " + time);
    }
  leitor.close();
  }
}

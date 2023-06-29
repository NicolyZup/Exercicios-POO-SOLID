package listaL7.Candidato;

import java.util.Scanner;

public class UsuarioCandidato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CandidatoController candidatoController = new CandidatoController();

        System.out.println("Bem vindo(a)!");

        boolean menu = true;

        while (menu){
            System.out.println("----------------------------");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Exibir candidatos");
            System.out.println("2 - Cadastrar candidato");
            System.out.println("3 - Remover candidato");
            System.out.println("4 - Sair");
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Candidatos");
                    System.out.println("----------------------------");

                    candidatoController.mostrarCandidatos();
                    break;
                case 2:
                    System.out.println("Cadastro de candidato");
                    System.out.println("----------------------------");

                    System.out.println("Informe o número de matrícula do candidato:");
                    int matricula = entrada.nextInt();

                    System.out.println("Informe a nota do candidato:");
                    double nota = entrada.nextDouble();
                    candidatoController.cadastrarCandidato(matricula,nota);
                    break;
                case 3:
                    System.out.println("Remover candidato");
                    System.out.println("----------------------------");

                    System.out.println("Informe o número de matrícula que desejar remover:");
                    int matriculaRemover = entrada.nextInt();

                    candidatoController.excluirCandidato(matriculaRemover);
                    break;
                case 4:
                    System.out.println("Desligando!");
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}

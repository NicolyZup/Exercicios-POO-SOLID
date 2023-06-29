package listaL7.Restaurante;

import listaL7.Produto.ProdutoController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioPrato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PratoController pratoController = new PratoController();

        System.out.println("Bem vindo(a)!");

        boolean menu = true;

        while (menu){
            System.out.println("----------------------------");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Exibir pratos");
            System.out.println("2 - Cadastrar prato");
            System.out.println("3 - Remover prato");
            System.out.println("4 - Sair");
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Pratos");
                    System.out.println("----------------------------");

                    pratoController.mostrarPratos();
                    break;
                case 2:
                    System.out.println("Cadastro de prato");
                    System.out.println("----------------------------");

                    System.out.println("Informe o nome do prato:");
                    String nomePrato = entrada.next();

                    System.out.println("Informe a quantidade ingredientes do prato:");
                    int qtdIngredientes = entrada.nextInt();

                    List<String> ingredientes = new ArrayList<>();
                    for (int i = 1; i <=qtdIngredientes;i++){
                        System.out.println("Informe o "+i+"º ingrediente:");
                        String ingrediente = entrada.next();
                        ingredientes.add(ingrediente);
                    }

                    pratoController.cadastrarPrato(nomePrato,ingredientes);
                    break;
                case 3:
                    System.out.println("Remover prato");
                    System.out.println("----------------------------");

                    System.out.println("Informe o prato que desejar remover:");
                    String pratoRemover = entrada.next();

                    pratoController.excluirPrato(pratoRemover);
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

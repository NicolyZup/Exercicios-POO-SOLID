package listaL7.Produto;

import java.util.Scanner;

public class UsuarioProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();

        System.out.println("Bem vindo(a)!");

        boolean menu = true;

        while (menu){
            System.out.println("----------------------------");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Exibir produtos");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Sair");
            int opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Produtos");
                    System.out.println("----------------------------");

                    produtoController.mostrarProdutos();
                    break;
                case 2:
                    System.out.println("Cadastro de produto");
                    System.out.println("----------------------------");

                    System.out.println("Informe o nome do produto:");
                    String nomeProduto = entrada.next();

                    System.out.println("Informe o valor do produto:");
                    double valorProduto = entrada.nextDouble();
                    produtoController.cadastrarProduto(nomeProduto,valorProduto);
                    break;
                case 3:
                    System.out.println("Remover produto");
                    System.out.println("----------------------------");

                    System.out.println("Informe o produto que desejar remover:");
                    String produtoRemover = entrada.next();

                    produtoController.excluirProduto(produtoRemover);
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

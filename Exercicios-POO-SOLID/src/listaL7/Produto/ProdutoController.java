package listaL7.Produto;

public class ProdutoController {
    BancoDeProdutos bancoDeProdutos = new BancoDeProdutos();

    public void mostrarProdutos(){
        if(bancoDeProdutos.getProdutos().size()==0){
            System.out.println("Nenhum produto cadastrado ainda :(");
        } else {
            for (Produto produto : bancoDeProdutos.getProdutos()) {
                System.out.println(produto.getNome() + "- R$" + produto.getPreco());
            }
        }
    }

    public void cadastrarProduto(String nomeProduto, double valorProduto){
        Produto produto = new Produto(nomeProduto,valorProduto);
        bancoDeProdutos.adicionarProduto(produto);
    }

    public void excluirProduto(String nomeProduto){
        for(Produto produto : bancoDeProdutos.getProdutos()){
            if(produto.getNome().equalsIgnoreCase(nomeProduto)){
                bancoDeProdutos.removerProduto(produto);
                return;
            }
        }
        System.out.println("Produto não localizado, tente novamente!");
    }
}

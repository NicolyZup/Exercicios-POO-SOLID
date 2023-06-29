package listaL7.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoDeProdutos {
    List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastrado!");
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
        System.out.println("Produto removido!");
    }
}

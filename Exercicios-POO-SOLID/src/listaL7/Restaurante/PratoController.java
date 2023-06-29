package listaL7.Restaurante;

import java.util.List;

public class PratoController {
    BancoDePratos bancoDePratos = new BancoDePratos();

    public void mostrarPratos(){
        if(bancoDePratos.getPratos().size()==0){
            System.out.println("Nenhum prato cadastrado ainda :(");
        } else {
            for (Prato prato : bancoDePratos.getPratos()) {
                System.out.println(prato.getNome() + " - " + prato.getIngredientes());
            }
        }
    }

    public void cadastrarPrato(String nomePrato, List<String> ingredientes){
        Prato prato = new Prato(nomePrato,ingredientes);
        bancoDePratos.adicionarPrato(prato);
    }

    public void excluirPrato(String nomePrato) {
        for (Prato prato : bancoDePratos.getPratos()) {
            if (prato.getNome().equalsIgnoreCase(nomePrato)) {
                bancoDePratos.removerPrato(prato);
                return;
            }
        }
        System.out.println("Prato não localizado, tente novamente!");
    }
}

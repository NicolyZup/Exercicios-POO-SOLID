package listaL7.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class BancoDePratos {
    List<Prato> pratos = new ArrayList<>();

    public List<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPrato(Prato prato){
        pratos.add(prato);
        System.out.println("Prato cadastrado!");
    }

    public void removerPrato(Prato prato){
        pratos.remove(prato);
        System.out.println("Prato removido!");
    }
}

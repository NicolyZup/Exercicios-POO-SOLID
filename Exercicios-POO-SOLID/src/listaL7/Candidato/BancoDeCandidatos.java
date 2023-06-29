package listaL7.Candidato;


import java.util.ArrayList;
import java.util.List;

public class BancoDeCandidatos {
    List<Candidato> candidatos = new ArrayList<>();

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato);
        System.out.println("Candidato cadastrado!");
    }

    public void removerCandidato(Candidato candidato){
        candidatos.remove(candidato);
        System.out.println("Candidato removido!");
    }
}

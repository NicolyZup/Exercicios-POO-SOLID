package listaL8;

import java.util.ArrayList;
import java.util.List;

//Classe Pias responsabilidade única, referentes a país
public class Pais {
    //encapsulamento
    private String isoCodigo;
    private String nome;
    private double populacao;
    private double dimensaoKm;
    private List<Pais> paisesFronteiras;

    public Pais(String isoCodigo, String nome, double dimensaoKm) {
        this.isoCodigo = isoCodigo;
        this.nome = nome;
        this.dimensaoKm = dimensaoKm;
    }


    public String getNome() {
        return nome;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public List<Pais> getPaisesFronteiras() {
        return paisesFronteiras;
    }

    public void setPaisesFronteiras(List<Pais> paisesFronteiras) {
        this.paisesFronteiras = paisesFronteiras;
    }

    //c) método que informe se outro país é vizinho do país que recebeu a mensagem
    public boolean paisVizinho(Pais pais){
        for(Pais fronteira: paisesFronteiras){
            if (fronteira.equals(pais)) {
                return true;
            }
        }
        return false;
    }

    //d) método que retorne a densidade populacional do país
    public double densidadePopulacional(){
        return populacao / dimensaoKm;
    }

    //Bônus: método que recebe um país como parâmetro e retorne a lista de vizinhos comuns aos dois países
    public List<Pais> vizinhosComuns(Pais pais){
        List<Pais> vizinhos = new ArrayList<>();
        for(Pais vizinho:paisesFronteiras){
            if(pais.paisVizinho(vizinho)){
                vizinhos.add(vizinho);
            }
        }
        return vizinhos;
    }

}

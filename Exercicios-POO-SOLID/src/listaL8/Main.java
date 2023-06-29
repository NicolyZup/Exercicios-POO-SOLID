package listaL8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Brasil("BRA","Brasil",8515767.049);
        Pais argentina = new Argentina("ARG","Argentina",4235904.99);
        Pais chile = new Chile("CHL","Chile",1435626.78);
        Pais peru = new Peru("PER","Peru",65437758.44);

        brasil.setPaisesFronteiras(new ArrayList<>());
        argentina.setPaisesFronteiras(new ArrayList<>());
        chile.setPaisesFronteiras(new ArrayList<>());
        peru.setPaisesFronteiras(new ArrayList<>());

        brasil.getPaisesFronteiras().add(argentina);
        brasil.getPaisesFronteiras().add(chile);
        brasil.getPaisesFronteiras().add(peru);

        argentina.getPaisesFronteiras().add(brasil);
        argentina.getPaisesFronteiras().add(chile);
        argentina.getPaisesFronteiras().add(peru);

        chile.getPaisesFronteiras().add(brasil);
        chile.getPaisesFronteiras().add(argentina);
        chile.getPaisesFronteiras().add(peru);

        peru.getPaisesFronteiras().add(brasil);
        peru.getPaisesFronteiras().add(chile);

        //c) método que informe se outro país é vizinho do país que recebeu a mensagem
        boolean vizinho = brasil.paisVizinho(argentina);
        if(vizinho){
            System.out.println("Brasil e Argentina são países vizinhos.");
        } else {
            System.out.println("Brasil e Argentina não são vizinhos.");
        }

        //d) método que retorne a densidade populacional do país
        brasil.setPopulacao(1234567);
        double densidade = brasil.densidadePopulacional();
        System.out.println("Densidade populacional do Brasil é: "+densidade);

        //Bônus: método que recebe um país como parâmetro e retorne a lista de vizinhos comuns aos dois países
        List<Pais> vizinhosComuns = brasil.vizinhosComuns(argentina);
        System.out.println("Vizinhos em comuns entre Brasil e Argentina:");
        for(Pais pais: vizinhosComuns){
            System.out.println("-"+pais.getNome());
        }
    }
}

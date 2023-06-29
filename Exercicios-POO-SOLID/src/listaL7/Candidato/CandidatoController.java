package listaL7.Candidato;

public class CandidatoController {
    BancoDeCandidatos bancoDeCandidatos = new BancoDeCandidatos();

    public void mostrarCandidatos(){
        if(bancoDeCandidatos.getCandidatos().size()==0){
            System.out.println("Nenhum candidato cadastrado ainda :(");
        } else {
            for (Candidato produto : bancoDeCandidatos.getCandidatos()) {
                System.out.println("Candidato: "+produto.getNumMatricula() + " - nota" + produto.getNota());
            }
        }
    }

    public void cadastrarCandidato(int numMatricula, double nota){
        Candidato candidato = new Candidato(numMatricula,nota);
        bancoDeCandidatos.adicionarCandidato(candidato);
    }

    public void excluirCandidato(int numCandidato){
        for(Candidato candidato : bancoDeCandidatos.getCandidatos()){
            if(candidato.getNumMatricula()== numCandidato){
                bancoDeCandidatos.removerCandidato(candidato);
                return;
            }
        }
        System.out.println("Candidato não localizado, tente novamente!");
    }
}

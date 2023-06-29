package listaL7.Candidato;

public class Candidato {
    private int numMatricula;
    private double nota;

    public Candidato(int numMatricula, double nota) {
        this.numMatricula = numMatricula;
        this.nota = nota;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public double getNota() {
        return nota;
    }
}

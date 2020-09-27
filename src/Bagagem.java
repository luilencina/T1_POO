//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//


public abstract class Bagagem {

    // peso da bagagem
    private double peso;
    // descricao
    private String descricao;
    //  prioridade
    private Prioridade prioridade;
    // valor da taxa
    private static double TaxaBagagem = 10.0;


    public Bagagem(double peso, String descr) {
    this.peso = peso;
    this.descricao = descr;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public abstract double getCusto();

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public static double getTaxaBagagem() {
        return TaxaBagagem;
    }

    @Override
    public String toString() {
        return String.format("Descricao: %s\nPeso: %.2f\nCusto : %.2f",this.descricao, this.peso, this.getCusto());
    }

}

public class Bagagem {

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

    public double getCusto(){
        if(peso < 5) return 0;
        return Math.floor(peso-5)*(3*TaxaBagagem);
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    protected double setPeso() {
       return this.peso = peso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static void setTaxaBagagem(double taxaBagagem) {
        TaxaBagagem = taxaBagagem;
    }


    @Override
    public String toString() {
        return super.toString();
    }

}

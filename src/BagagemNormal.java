//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//


public class BagagemNormal extends Bagagem{
    private double custo;

    public BagagemNormal(double peso, String descr, Prioridade prio) {
        super(peso, descr);
        this.setPrioridade(prio);
    }

    //se o peso for menor ou igual a 20 ele retorna custo = 0 (isento)
    public double getCusto() {
        if(getPeso() <= 20)return 0.0;
        int nMultiplier = 1;

        //ele pega a prioridade e refina no switch
        switch(getPrioridade()){
            // se for PRIORITARIA o multiplier vai ser * 5
            case PRIORITARIA:
                nMultiplier = 5;
                break;
            // se for URGENTE o multiplier vai ser * 10
            case URGENTE:
                nMultiplier = 10;
                break;
            default: break;
        }
        // no final ele retorna o calculo o resultado do mesmo
        return Math.floor(this.getPeso()-20)*(nMultiplier*getTaxaBagagem());
    }

    @Override
    public String toString(){
        return String.format("Descricao: %s\nPeso: %.2f\nPrioridade: %s\nCusto: %.2f",getDescricao(), getPeso(), getPrioridade().name(), getCusto());
    }
}

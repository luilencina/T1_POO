//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//

public class BagagemFragil extends Bagagem{
    private double valorSeguro = 150.0;

    public BagagemFragil(double peso, String descr, double vs, Prioridade prio) {
        super(peso, descr);
        this.setPrioridade(prio);
        this.valorSeguro = vs;
    }

    public double getValorSeguro(){
        return this.valorSeguro + getCusto();
    }

    public void setValorSeguro(double vs){
         this.valorSeguro = vs;
    }

    public double getCusto() {
        // multiplier no 0 pq 0 * qualquer coisa == 0 :)
        int nMultiplier = 0;
        //ele pega a prioridade e refina no switch
        switch(getPrioridade()){
            //caso for normal 0 * qualquer coisa == 0 e vai ser apenas o valor do seguro
            case NORMAL:
                nMultiplier = 0;
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
        return String.format("Descricao: %s\nPeso: %.2f\nPrioridade: %s\nSeguro: %.2f",this.getDescricao(), this.getPeso(), this.getPrioridade().name(), this.getValorSeguro());
    }
}


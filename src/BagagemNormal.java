import java.util.Set;

public class BagagemNormal extends Bagagem{
    private double custo;

    public BagagemNormal(double peso, String descr) {
        super(peso, descr);
    }


    public double getCusto(int custo) {
        Bagagem bagagem = new Bagagem(double peso, String descricao);
        Prioridade pri = Prioridade.values()[custo];
        peso = bagagem.setPeso();

        switch(pri){
            case NORMAL:
                if(peso <= 20) return 0;
                else Math.floor(peso-20)*(1*TaxaBagagem);
                return custo;
                break;
            case PRIORITARIA:
                if(peso <= 20) return 0;
                else Math.floor(peso-20)*(5*TaxaBagagem);
                return custo;
                break;
            case URGENTE:
                if(peso <= 20) return 0;
                else Math.floor(peso-20)*(10*TaxaBagagem);
                return custo;
                break;

        }



        if(peso <= 20) return 0;
        else Math.floor(peso-20)*(3*TaxaBagagem);
        return custo;
    }
}

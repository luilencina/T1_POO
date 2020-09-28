//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//

public class BagagemDeMao extends Bagagem{
        private double custo;

        public BagagemDeMao(double peso, String descr, Prioridade prio) {
            super(peso, descr);
            this.setPrioridade(prio);
        }

        public double getCusto(){
            double peso = this.getPeso();
            double taxaBagagem = this.getTaxaBagagem();

            if(peso < 5) return 0;
            return Math.floor(peso-5)*(3*taxaBagagem);
        }

        @Override
        public String toString(){
            return String.format("Descricao: %s\nPeso: %.2f\nPrioridade: %s\nCusto: %.2f",getDescricao(), getPeso(), getPrioridade().name(), getCusto());
        }
}

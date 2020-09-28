//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//


public class main {
    public static void main(String args[]){
        final ListaDeBagagens lb = new ListaDeBagagens();

        // TESTE DE BAGAGENS DE MAO
        lb.incluir(new BagagemDeMao(25," pertences de higiene e computador", Prioridade.NORMAL));
        lb.incluir(new BagagemDeMao(10," pertences de higiene e computador", Prioridade.NORMAL));
        lb.incluir(new BagagemDeMao(100," pertences de higiene e computador", Prioridade.NORMAL));

        lb.incluir(new BagagemDeMao(20," pertences de higiene e computador", Prioridade.PRIORITARIA));
        lb.incluir(new BagagemDeMao(10," pertences de higiene e computador", Prioridade.PRIORITARIA));
        lb.incluir(new BagagemDeMao(100," pertences de higiene e computador", Prioridade.PRIORITARIA));

        lb.incluir(new BagagemDeMao(20," pertences de higiene e computador", Prioridade.URGENTE));
        lb.incluir(new BagagemDeMao(10," pertences de higiene e computador", Prioridade.URGENTE));
        lb.incluir(new BagagemDeMao(100," pertences de higiene e computador", Prioridade.URGENTE));


        // TESTE DE BAGAGENS FRAGEIS
        lb.incluir(new BagagemFragil(20," Varios eletronicos", 150, Prioridade.NORMAL));
        lb.incluir(new BagagemFragil(10," Varios eletronicos", 150, Prioridade.NORMAL));
        lb.incluir(new BagagemFragil(100,"Varios eletronicos", 150, Prioridade.NORMAL));

        lb.incluir(new BagagemFragil(20," Varios eletronicos", 150, Prioridade.PRIORITARIA));
        lb.incluir(new BagagemFragil(10," Varios eletronicos", 150, Prioridade.PRIORITARIA));
        lb.incluir(new BagagemFragil(100,"Varios eletronicos", 150, Prioridade.PRIORITARIA));

        lb.incluir(new BagagemFragil(10," Varios eletronicos", 150, Prioridade.URGENTE));
        lb.incluir(new BagagemFragil(20," Varios eletronicos", 150, Prioridade.URGENTE));
        lb.incluir(new BagagemFragil(100,"Varios eletronicos", 150, Prioridade.URGENTE));


        // TESTE DE BAGAGENS NORMAL
        lb.incluir(new BagagemNormal(10,"PC Gamer",Prioridade.NORMAL));
        lb.incluir(new BagagemNormal(20,"PC Gamer",Prioridade.NORMAL));
        lb.incluir(new BagagemNormal(100,"PC Gamer",Prioridade.NORMAL));

        lb.incluir(new BagagemNormal(10,"PC Gamer",Prioridade.PRIORITARIA));
        lb.incluir(new BagagemNormal(20,"PC Gamer",Prioridade.PRIORITARIA));
        lb.incluir(new BagagemNormal(100,"PC Gamer",Prioridade.PRIORITARIA));

        lb.incluir(new BagagemNormal(10,"notebook",Prioridade.URGENTE));
        lb.incluir(new BagagemNormal(20,"notebook",Prioridade.URGENTE));
        lb.incluir(new BagagemNormal(100,"notebook",Prioridade.URGENTE));


        System.out.println(lb.listarPorCusto());


        double valorTotal = lb.getValorSeguro();
        System.out.println("Valor total dos Seguros: " + valorTotal);

        int numeroSeguros = lb.frageis();
        System.out.println("Numero de seguros contratados: " + numeroSeguros);



    }

}

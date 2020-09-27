//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ListaDeBagagens {

    private ArrayList<Bagagem> bags;
    public ListaDeBagagens(){
        bags = new ArrayList<Bagagem>();
    }

    public void incluir(Bagagem b){
        bags.add(b);
    }

    public double custoTotal(){
        return bags.stream().mapToDouble(a -> a.getCusto()).sum();
    }

    public int getTotal(){
        return bags.size();
    }

    public String listarPorPeso(){
        StringBuilder sb = new StringBuilder();
        bags.stream().sorted(Comparator.comparing(b -> b.getPeso()))
                .collect(Collectors.toList())
                .forEach(b -> sb.append(b.toString() + "\n\n"));
        return sb.toString();
    }

    public String listarPorCusto(){
        StringBuilder sb = new StringBuilder();
        bags.stream().sorted(Comparator.comparing(b -> b.getCusto()))
                .collect(Collectors.toList())
                .forEach(b -> sb.append(b.toString() + "\n\n"));
        return sb.toString();
    }

    public int frageis(){
        int fragil = 0;
        for(int i=0; i < bags.size(); i++) {
            if (bags.get(i) instanceof BagagemFragil) {
                fragil++;
            }
        }
        return fragil;
    }

    public double getValorSeguro(){
        double valSeguro = 0.0;
        for (int i=0; i < bags.size();i++){
            if(bags.get(i) instanceof BagagemFragil){
                valSeguro += ((BagagemFragil)bags.get(i)).getValorSeguro();
            }
        }
        return valSeguro;
    }


}

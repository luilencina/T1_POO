//  *********************** @author Luiza Lencina  ************************//
//  **************** Matricula: 19201083 //  Digito: 3  ****************//

import java.util.ArrayList;

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
        return 1;
    }
}

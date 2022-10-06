import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {   

        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Luffy");
        nomes.add("Zoro");
        

        /*
        *sort -> ordenar
        *Collections.sort(numeros);
        *Revertendo a ordem para decrescente com Collections.reverseOrder()
        */
        Collections.sort(nomes, Collections.reverseOrder());

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

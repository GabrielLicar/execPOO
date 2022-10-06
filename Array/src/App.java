import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {     
        
        String[] ArrayEstatico = new String[5];

        ArrayEstatico[0] = "Luffy";
        ArrayEstatico[1] = "Naruto";
        ArrayEstatico[2] = "Asta";
        ArrayEstatico[3] = "Goku";
        ArrayEstatico[4] = "Anya Forger";

        //ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> ArrayDinamico = new ArrayList<String>();
        ArrayDinamico.add("Luffy"); // indice 0
        ArrayDinamico.add("Naruto"); // indice 1
        ArrayDinamico.add("Asta"); // indice 2
        ArrayDinamico.add("Goku"); // indice 3
        ArrayDinamico.add("Anya Forger"); // indice 4

        System.out.println("Imprimindo o Array Estatico!");
        for (int indice = 0; indice < ArrayEstatico.length; indice++) {
            System.out.println(ArrayEstatico[indice]);
        }

        System.out.println("Imprindo o Array Dinamico/ArrayList");
        for (int indice = 0; indice < ArrayDinamico.size(); indice ++) {
            System.out.println(ArrayDinamico.get(indice));
        }

    }
}

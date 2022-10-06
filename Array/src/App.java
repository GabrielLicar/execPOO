import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {   
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Joao", 18));
        pessoas.add(new Pessoa("Paulo", 17));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }


    }
}

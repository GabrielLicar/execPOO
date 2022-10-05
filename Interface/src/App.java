import classes.TiroAoAlvo;
import classes.Videogame;

public class App {
    public static void main(String[] args) throws Exception {
        
        Videogame psN = new Videogame();
        psN.ligar();
        psN.jogar(new TiroAoAlvo());
        psN.fechar();
        
    }
}

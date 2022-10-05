import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo circ = new Circulo(2);
        System.out.println(circ.calcularArea());

        Quadrado quadro = new Quadrado(5);

        System.out.println(quadro.calcularArea());

    }
}

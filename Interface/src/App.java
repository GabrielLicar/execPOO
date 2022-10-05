import classes.CalculadorArea;
import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo circ = new Circulo(2);
        Quadrado quadro = new Quadrado(5);
        
        CalculadorArea calcular = new CalculadorArea();

        System.out.println(calcular.somarAreas(quadro, quadro));
        
    }
}

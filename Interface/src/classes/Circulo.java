package classes;

public class Circulo implements FiguraGeometrica{

    // Atributos;
    private int raio;

    //Construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    //Metodos Especiais;
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    //Métodos Getters & Setters;
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    

    
    
}

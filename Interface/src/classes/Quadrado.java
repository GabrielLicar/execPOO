package classes;

public class Quadrado implements FiguraGeometrica{
    
    //Atributo;
    private int lado;
    
    //Construtor;
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    //Método Especiais;
    @Override
    public double calcularArea() {
        return (int) Math.pow(lado, 2);
    }

    //Método Getters & Setters;
    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
    
}

package classes;

public class Quadrado {
    
    //Atributo;
    private int lado;
    
    //Construtor;
    public Quadrado(int lado) {
        this.lado = lado;
    }
    //Método Especiais;
    public int gerarArea() {
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

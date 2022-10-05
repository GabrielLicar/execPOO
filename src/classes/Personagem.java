package classes;

public class Personagem {
    
    //Atributos da Classe
    private String nome;
    private int nivel;
    private int dano;
    private int forca;
    private int vida;
    private String classe;

    //Construtor

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = 5;
    }

    //Métodos Especiais

    //Métodos Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}

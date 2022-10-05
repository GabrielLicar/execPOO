package classes;

import javax.swing.JOptionPane;

public class Personagem {
    
    //Atributos da Classe
    private String nome;
    private int gear;
    private int dano;
    private int forca;
    private int vida;
    private String classe;

    //Construtor

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        this.gear = 5;
        this.vida = getGear() * 1500;
        
        if (classe.equals("Pirata")) {
            this.forca = getVida() * 11;
        } else {
            this.forca = getGear() * 1;
        }
    }

    //Métodos Especiais

        public void mostrarStatus() {
            String status = String.format("Personagem %s\nGear: %d\nVida: %d\nClasse: %s\nForca: %d", nome, gear, vida, classe, forca);
            JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
        }

    //Métodos Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
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

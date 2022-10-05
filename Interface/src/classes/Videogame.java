package classes;

public class Videogame {

    private boolean estaLigado;
    private Jogo jogo;

    public void ligar() {
        System.out.println("Ligando o videogame ...");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo) {
        if (estaLigado == true) {
        System.out.println("Iniciando a playlist de jogos");
        this.jogo = jogo;
        jogo.jogar();
        }else {
            System.out.println("Videogame desligado!");
        }
    }

    public void fechar() {
        if (estaLigado == true) {
            System.out.println("Fechando a playlist de jogos");
            if (jogo != null) {
                jogo.fechar();
                jogo = null; //Definindo o valor de null que não está rodando!
            } else {
                System.out.println("Não tem nenhum jogo rodando!");
        }
            }else {
                System.out.println("Videogame desligado!");
        }

    }
    
}

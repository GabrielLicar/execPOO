import javax.swing.JOptionPane;

import classes.Personagem;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        String name = JOptionPane.showInputDialog(null, "Nome do personagem: ");
        String classe = JOptionPane.showInputDialog(null, "Classe do Personagem: ");    

        Personagem p = new Personagem(name, classe);

        p.mostrarStatus();
        
    }
}

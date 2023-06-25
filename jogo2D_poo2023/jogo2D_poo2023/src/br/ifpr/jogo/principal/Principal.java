package br.ifpr.jogo.principal;

import javax.swing.JFrame;

import br.ifpr.jogo.modelo.Fase;

public class Principal extends JFrame {
    private static final int WINDOW_WIDTH = 1900;
    private static final int WINDOW_HEIGHT = 1080;

    public Principal() {
        Fase fase = new Fase();
        super.add(fase);
        super.setResizable(false);
        super.setVisible(true);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("Jogo da Nathy");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Principal();

    }
}

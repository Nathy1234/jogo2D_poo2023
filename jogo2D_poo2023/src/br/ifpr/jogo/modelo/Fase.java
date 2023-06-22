package br.ifpr.jogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
    private Image imagemFundo;

    public Fase() {
        ImageIcon carregando = new ImageIcon("recursos\\imagemfundo.jpg");
        this.imagemFundo = carregando.getImage();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.imagemFundo, 0, 0, null);
        g.dispose();
    }

}

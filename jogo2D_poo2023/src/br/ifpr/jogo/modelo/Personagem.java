package br.ifpr.jogo.modelo;

import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoEmX;
    private int posicaoEmY;
    private int deslocamentoEmX;
    private int deslocamentoEmY;
    private Image image;
    private int largutaImagem;
    private int alturaImagem;

    public Personagem() {
        this.posicaoEmX = 100;
        this.posicaoEmY = 100;

    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\nave");
        this.imagemfundo = "";

    }

    public int getPosicaoEmX() {
        return this.posicaoEmX;
    }

    public void setPosicaoEmX(int posicaoEmX) {
        this.posicaoEmX = posicaoEmX;
    }

    public int getPosicaoEmY() {
        return this.posicaoEmY;
    }

    public void setPosicaoEmY(int posicaoEmY) {
        this.posicaoEmY = posicaoEmY;
    }

    public int getDeslocamentoEmX() {
        return this.deslocamentoEmX;
    }

    public void setDeslocamentoEmX(int deslocamentoEmX) {
        this.deslocamentoEmX = deslocamentoEmX;
    }

    public int getDeslocamentoEmY() {
        return this.deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int deslocamentoEmY) {
        this.deslocamentoEmY = deslocamentoEmY;
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getLargutaImagem() {
        return this.largutaImagem;
    }

    public void setLargutaImagem(int largutaImagem) {
        this.largutaImagem = largutaImagem;
    }

    public int getAlturaImagem() {
        return alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }

}

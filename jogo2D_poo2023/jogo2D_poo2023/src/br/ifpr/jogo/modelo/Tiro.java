package br.ifpr.jogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro {
    private int posicaoEmX;
    private int posicaoEmY;
    private Image Imagem;
    private int larguraImagem;
    private int alturaImagem;
    private int tiros;
    private int posicaoPersonagemEmX;
    private int posicaoPersonagemEMy;
    private static final int VELOCIDADE = 3;

    public Tiro(int posicaoEmX, int posicaoEmY) {
        this.posicaoEmX = posicaoEmX;
        this.posicaoEmY = posicaoEmY;
    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\imagemTiro.png");
        this.Imagem = carregando.getImage();
        this.alturaImagem = this.Imagem.getWidth(null);
        this.larguraImagem = this.Imagem.getWidth(null);
    }

    public void atualizar() {
        this.posicaoEmX += VELOCIDADE;
    }

    public int getPosicaoEmX() {
        return posicaoEmX;
    }

    public void setPosicaoEmX(int posicaoEmX) {
        this.posicaoEmX = posicaoEmX;
    }

    public int getPosicaoEmY() {
        return posicaoEmY;
    }

    public void setPosicaoEmY(int posicaoEmY) {
        this.posicaoEmY = posicaoEmY;
    }

    public Image getImagem() {
        return Imagem;
    }

    public void setImagem(Image imagem) {
        Imagem = imagem;
    }

    public int getLarguraImagem() {
        return larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public int getPosicaoPersonagemEmX() {
        return posicaoPersonagemEmX;
    }

    public void setPosicaoPersonagemEmX(int posicaoPersonagemEmX) {
        this.posicaoPersonagemEmX = posicaoPersonagemEmX;
    }

    public int getPosicaoPersonagemEMy() {
        return posicaoPersonagemEMy;
    }

    public void setPosicaoPersonagemEMy(int posicaoPersonagemEMy) {
        this.posicaoPersonagemEMy = posicaoPersonagemEMy;
    }

    public static int getVelocidade() {
        return VELOCIDADE;
    }

}
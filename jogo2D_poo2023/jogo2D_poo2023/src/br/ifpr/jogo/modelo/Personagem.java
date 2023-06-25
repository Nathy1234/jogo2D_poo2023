package br.ifpr.jogo.modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Personagem {
    private int posicaoEmX;
    private int posicaoEmY;
    private int deslocamentoEmX;
    private int deslocamentoEmY;
    private Image imagem;
    private static final int DESCOLAMENTO = 4;
    private static final int POSICAO_INICIAL_EM_Y = 120;
    private ArrayList<Tiro> tiros;
    private int larguraImagem;
    private int alturaImagem;

    public ArrayList<Tiro> tiros() {
        return tiros;

    }

    public Personagem(int posicaoEmX, int posicaoEmY, int deslocamentoEmX, int deslocamentoEmY, Image imagem) {
        this.posicaoEmX = posicaoEmX;
        this.posicaoEmY = posicaoEmY;
        this.deslocamentoEmX = deslocamentoEmX;
        this.deslocamentoEmY = deslocamentoEmY;
        this.imagem = imagem;
        this.tiros = new ArrayList<Tiro>();

    }

    public Personagem() {
        this.posicaoEmX = POSICAO_INICIAL_EM_X;
        this.posicaoEmY = POSICAO_INICIAL_EM_Y;
        this.tiros = new ArrayList<Tiro>();

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

    public int getDeslocamentoEmX() {
        return deslocamentoEmX;
    }

    public void setDeslocamentoEmX(int deslocamentoEmX) {
        this.deslocamentoEmX = deslocamentoEmX;
    }

    public int getDeslocamentoEmY() {
        return deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int deslocamentoEmY) {
        this.deslocamentoEmY = deslocamentoEmY;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public static int getDescolamento() {
        return DESCOLAMENTO;
    }

    private static final int POSICAO_INICIAL_EM_X = 100;

    public static int getPosicaoInicialEmX() {
        return POSICAO_INICIAL_EM_X;
    }

    public static int getPosicaoInicialEmY() {
        return POSICAO_INICIAL_EM_Y;
    }

    public void atualizar() {
        this.posicaoEmX += this.deslocamentoEmX;
        this.posicaoEmY += this.deslocamentoEmY;

    }

    public void carregar() {
        ImageIcon carregando = new ImageIcon("recursos\\submarino.png");
        this.imagem = carregando.getImage();
        this.imagem.getWidth(null);
        this.imagem.getHeight(null);

    }

    public void mover(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                this.deslocamentoEmY = -Personagem.getDescolamento();
                break;
            case KeyEvent.VK_DOWN:
                this.deslocamentoEmY = Personagem.getDescolamento();
                break;
            case KeyEvent.VK_LEFT:
                this.deslocamentoEmX = -Personagem.getDescolamento();
                break;
            case KeyEvent.VK_RIGHT:
                deslocamentoEmX = Personagem.getDescolamento();
                break;
            default:
                break;

        }

    }

    public void parar(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                deslocamentoEmY = -0;
                break;
            case KeyEvent.VK_DOWN:
                deslocamentoEmY = 0;
                break;
            case KeyEvent.VK_LEFT:
                deslocamentoEmX = -0;
                break;
            case KeyEvent.VK_RIGHT:
                deslocamentoEmX = 0;
                break;
            default:
                break;
        }
    }

    public final void atirar() {
        int frenteDaNave = this.posicaoEmX + this.larguraImagem;
        int meioDaNave = this.posicaoEmY + (this.alturaImagem / 2);
        Tiro tiro = new Tiro(frenteDaNave, meioDaNave);
        this.tiros.add(tiro);
    }

    public ArrayList<Tiro> getTiros() {
        return tiros;
    }

}

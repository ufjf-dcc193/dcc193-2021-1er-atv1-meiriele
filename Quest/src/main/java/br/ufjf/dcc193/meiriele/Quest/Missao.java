package br.ufjf.dcc193.meiriele.Quest;

public class Missao {
    private Guerreiro guerreiro;

    public Missao(Guerreiro guerreiro){
        this.guerreiro = guerreiro;
    }
    public Missao(){

    }
    public Guerreiro getGuerreiro() {
        return guerreiro;
    }
    public void setGuerreiro(Guerreiro guerreiro) {
        this.guerreiro = guerreiro;
    }
    public void iniciar() {
        System.out.println("A Missão tem inicio...");
        this.guerreiro.agir();
    }
    public void concluir() {
        System.out.println("A Missão foi concluida...");
    }
    
}

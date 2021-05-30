package br.ufjf.dcc193.meiriele.Quest;

public class Missao {
    private Heroi heroi;

    public Missao(Heroi heroi){
        this.heroi = heroi;
    }
    public Missao(){

    }
    public Heroi getHeroi() {
        return heroi;
    }
    public void setGuerreiro(Heroi heroi) {
        this.heroi = heroi;
    }
    public void iniciar() {
        System.out.println("A Missão tem inicio...");
        this.heroi.agir();
    }
    public void concluir() {
        System.out.println("A Missão foi concluida...");
    }
    
}

package br.ufjf.dcc193.meiriele.Quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Missao {
    @Autowired
    private Heroi heroi;

    public Missao(Heroi heroi){
        System.out.println("O rei anunciou uma nova missão");
        this.heroi = heroi;
    }
    public Missao(){
    this(null);
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

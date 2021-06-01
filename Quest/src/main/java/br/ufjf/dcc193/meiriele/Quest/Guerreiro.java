package br.ufjf.dcc193.meiriele.Quest;

import org.springframework.stereotype.Component;

@Component
public class Guerreiro implements Heroi{
    public Guerreiro(){
        System.out.println("Um novo guerreiro chega ao reino");
    }
    @Override
    public void agir(){
        System.out.println("O Guerreiro luta");
    }

}

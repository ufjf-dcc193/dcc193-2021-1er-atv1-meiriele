package br.ufjf.dcc193.meiriele.Quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);

		Guerreiro g1 = new Guerreiro();
		Missao m1 = new Missao(g1);
		m1.iniciar();
		m1.concluir();
	}

}

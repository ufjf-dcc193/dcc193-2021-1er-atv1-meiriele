package br.ufjf.dcc193.meiriele.Quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestApplication.class, args);

		Heroi h1 = new Paladino();
		Missao m1 = new Missao(h1);
		m1.iniciar();
		m1.concluir();
	}

}

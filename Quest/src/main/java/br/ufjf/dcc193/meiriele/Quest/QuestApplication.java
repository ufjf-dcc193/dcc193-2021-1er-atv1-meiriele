package br.ufjf.dcc193.meiriele.Quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(QuestApplication.class, args);

		
		Missao m1 = ctx.getBean(Missao.class);
		m1.iniciar();
		m1.concluir();

		Missao m2 = ctx.getBean(Missao.class);
		m2.iniciar();
		m2.concluir();
	}

}

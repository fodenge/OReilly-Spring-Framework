package com.oreilly.spring.learn_spring_framework;

import com.oreilly.spring.learn_spring_framework.enterprise.example.MyWebController;
import com.oreilly.spring.learn_spring_framework.game.GameRunner;
import com.oreilly.spring.learn_spring_framework.game.MarioGame;
import com.oreilly.spring.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();  // Now we can run any game without the changing the code in Game Runner -- LOOSE COUPLING
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		MyWebController myWebController = context.getBean(MyWebController.class);
		System.out.println(myWebController.returnValueFromBusinessLayer());
	}

}

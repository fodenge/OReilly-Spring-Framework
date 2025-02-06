package com.oreilly.spring.learn_spring_framework;

import com.oreilly.spring.learn_spring_framework.game.GameRunner;
import com.oreilly.spring.learn_spring_framework.game.MarioGame;
import com.oreilly.spring.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();  // Now we can run any game without the changing the code in Game Runner -- LOOSE COUPLING
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}

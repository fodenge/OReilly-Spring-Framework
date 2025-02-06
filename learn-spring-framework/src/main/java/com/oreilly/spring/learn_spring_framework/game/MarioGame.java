package com.oreilly.spring.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump...");
    }
    public void down(){
        System.out.println("Down into a hole.");
    }
    public void right(){
        System.out.println("Accelerate++");
    }
    public void left(){
        System.out.println("STOP");
    }
}

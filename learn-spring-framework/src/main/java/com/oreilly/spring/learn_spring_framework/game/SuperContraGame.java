package com.oreilly.spring.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("SuperContra jump");
    }
    public void down(){
        System.out.println("SuperContra down");
    }
    public void right(){
        System.out.println("SuperContra right");
    }
    public void left(){
        System.out.println("SuperContra left");
    }
}

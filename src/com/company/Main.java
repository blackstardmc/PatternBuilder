package com.company;

public class Main {

    public static void main(String[] args) {
	PCDirector director=new PCDirector();
	System.out.println(director.createGamerComputer().getCpu());
	System.out.println(director.createWorkComputer().getCpu());
    }
}

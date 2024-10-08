package com.osrdcc.rpg.game.main;
import com.osrdcc.rpg.game.entity.Character;

public class Main {

	public static void main(String[] args) {
		Character hero = new Character("Takito", 1, 14, 14, 12, 16, 11, 10);
		hero.setXP(0);
		System.out.println(hero);
		System.out.println(hero.score());
		
		hero.setXP(10);
		System.out.println(hero);
	
	}
	
}

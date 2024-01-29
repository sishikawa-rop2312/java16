package renshu;

import java.util.ArrayList;

public class Renshu16_2 {

	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("斎藤"));
		heros.add(new Hero("鈴木"));
		
		for(Hero hero : heros) {
			System.out.println(hero.getName());
		}
	}

}

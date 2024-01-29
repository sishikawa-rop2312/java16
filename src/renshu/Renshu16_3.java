package renshu;

import java.util.HashMap;
import java.util.Map;

public class Renshu16_3 {

	public static void main(String[] args) {
		Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
		heros.put(new Hero("斎藤"), 3);
		heros.put(new Hero("鈴木"), 7);
		
		for(Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}

}

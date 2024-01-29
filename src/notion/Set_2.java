package notion;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Set_2 {
	public static void main(String[] args) {
		System.out.println("サイコロを繰り返しふります");
		
		Random rand = new Random();
		
		Set<Integer> dices = new HashSet<Integer>();
		
		int count = 0;
		while (dices.size() < 6) {
			count++;
			int dice = rand.nextInt(6) + 1;
			System.out.println(dice);
			dices.add(dice);
		}
		
		System.out.println(count + "回で揃いました");
		
//		for (int dice : dices) {
//			System.out.println(dice);
//		}
	}
}
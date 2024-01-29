package notion;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Set_1 {
	public static void main(String[] args) {
		System.out.print("何回ふる>>");
		Scanner scanner = new Scanner(System.in);
		int rollDiceNum = scanner.nextInt();

		Random rand = new Random();
		
		Set<Integer> dices = new HashSet<Integer>();
		
		for (int i = 0; i < rollDiceNum; i++) {
			int dice = rand.nextInt(6) + 1;
			System.out.println(dice);
			dices.add(dice);
		}
		
		if (dices.size() == 1) {
			System.out.println("ゾロ目です");
		} else {
			System.out.println("ゾロ目ではありません");
		}
		
		scanner.close();
	}
}

package notion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_3 {
	public static void main(String[] args) {
		System.out.println("1-10のランダムな値を10個生成します。");
		
		Random rand = new Random();
		
		List<Integer> nums = new ArrayList<>();
		
		final int  COUNT = 10;
		
		for (int i = 0; i < COUNT; i++) {
			int num = rand.nextInt(10) + 1;
			nums.add(num);
		}
		System.out.println(nums);

		System.out.println("昇順にしました");
		Set<Integer> ascNums = new TreeSet<>(nums);
		System.out.println(ascNums);
	}
}
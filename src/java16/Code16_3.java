package java16;

import java.util.HashSet;
import java.util.Set;

public class Code16_3 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");

		for(String color : colors) {
			System.out.println(color);
		}
	}
}

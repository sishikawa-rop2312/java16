package java16;

import java.util.ArrayList;

public class Code16_1 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(30);
		points.add(50);

		
		for (int i = points.size() - 1; i >= 0; i--) {
            if (points.get(i) <= 50) {
                points.remove(i);
            }
        }

        for (int p : points) {
            System.out.println(p);
        }
	}

}

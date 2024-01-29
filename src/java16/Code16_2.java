package java16;

import java.util.ArrayList;
import java.util.Iterator;

public class Code16_2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("鈴木");
		names.add("山本");

		Iterator<String> it = names.iterator();

        while (it.hasNext()) {
        	String e = it.next();
            System.out.println(e);
        }
	}
}

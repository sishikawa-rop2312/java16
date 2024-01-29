package notion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_4 {
	public static void main(String[] args) {
		String dataCSV = "タコ,イクラ,マグロ,トロ,イクラ,ウニ,ホタテ,マグロ,トロ,マグロ,エビ,イカ";
		String[] data = dataCSV.split(",");
		
		List<String> list = new ArrayList<>();
		
		System.out.println("今日食べたお寿司");
		for (String sushi : data) {
			list.add(sushi);
			System.out.println(sushi);
		}
		
		System.out.println("食べた種類を食べた順に表示します(重複除く)");
		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);
	}
}
package java16;

import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {
//		Human h1 = new Human("田中");
//		Human h2 = new Human("鈴木");
//		Human h3 = new Human("加藤");
		
		ArrayList<Human> humans = new ArrayList<Human>();
		
		for (int i = 0; i < 100; i++) {
			Human h = new Human("村人" + i);
			humans.add(h);
		}
		
//		humans.add(h1);
//		humans.add(h2);
//		humans.add(h3);

//		for (Human human : humans) {
//			human.intro();
//		}
		
		Human human = humans.remove(3);	// 私は村人3です
		human.intro();
		
	}
}

package practiceQuestion;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(11, "Apple");
		hmap.put(22, "Orange");
		hmap.put(33, "Kiwi");
		hmap.put(44, "Banana");
		hmap.put(55, "kiwi");
		
		hmap.entrySet().stream().filter(map -> map.getKey()<= 22).forEach(s->System.out.println(s));
		hmap.entrySet().stream().filter(m->m.getValue().contains("a")).forEach(s->System.out.println(s));
		hmap.entrySet().stream().filter(m->m.getValue().equalsIgnoreCase("kiwi")).forEach(s->System.out.println(s.getKey()));

	}

}

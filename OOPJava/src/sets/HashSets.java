package sets;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		HashSet<String> set = new HashSet<String>();
		set.add("Misho");
		set.add("Pesho");
		set.add("Ivan");
		set.add("Po");
		set.add("Misho");
		set.add("Ivan");
		set.add("Marto");
		set.add("Misho");
		
		set.stream().forEach(x->System.out.println(x));
	}

}

package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
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

package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListsOfArray {

	public static void main(String[] args) {
		@SuppressWarnings("serial")
		ArrayList<String> names = new ArrayList<String>() {{
			add("Peter");
			add("Maria");
			add("Katya");
			add("Todor");
		}};
		names.add("Nakov");
		names.add(5, "Sylvia");
		names.remove(0);
		names.remove("Todor");
		names.addAll(Arrays.asList("Alice","Tedy"));
		names.set(2, "Mike");
		System.out.println(names);
		
		names.stream().forEach(x->{
					System.out.println(x + "a");
				});
	}

}

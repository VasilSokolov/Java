package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		HashMap<String, Integer> grades = new HashMap<>();
		grades.put("Pesho", 5);
		grades.put("Gogo", 6);
		grades.put("Po", 2);
		grades.put("Pesho", 3);
		grades.put("Ivan", 4);
		
		for (String key : grades.keySet()) {
			System.out.println("" + key + " -> " + grades.get(key));
		}
		
		System.out.println();
		
		HashMap<String, ArrayList<Integer>> theGrades = new HashMap<>();
		theGrades.put("Pesho",new ArrayList<Integer>(Arrays.asList(5)));
		theGrades.put("Gogo",new ArrayList<Integer>(Arrays.asList(3)));
		theGrades.put("Pesho",new ArrayList<Integer>(Arrays.asList(5, 3, 2)));
		theGrades.put("Pesho",new ArrayList<Integer>(Arrays.asList(6, 4, 6)));
		theGrades.put("Ivan",new ArrayList<Integer>(Arrays.asList(2)));

		for (String key : theGrades.keySet()) {
			System.out.println("" + key + " -> " + theGrades.get(key));
		}
		
	}
}

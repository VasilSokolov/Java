package Polymorphism;

public class Executed {

	public static void main(String[] args) {
		Animals genericAnimals = new Animals();
		
		System.out.println(genericAnimals.getName());
		System.out.println(genericAnimals.favFood);
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println();		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		Animals tobby = new Cats("Tobby", "Salmon", "Ball");
		
		acceptAnimal(tobby);
	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);		
		System.out.println();
		
		randAnimal.walkAround();
		
		Cats tempCats = (Cats) randAnimal;
		System.out.println(tempCats.favToy);
		
		System.out.println(((Cats)randAnimal).favToy);
		
		if (randAnimal instanceof Cats) {
			System.out.println(randAnimal.getName() + " is a Cat");
		}
	}

}

package Polymorphism;

public class Cats extends Animals {
	public String favToy = "Yern";
	public void playWith() {
		System.out.println("Yeah" + favToy);
	}
	
	//overriding method
	public void walkAround() {
		System.out.println(this.getName() + "stacks around");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public Cats() {
		
	}
	
	public Cats(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}
}

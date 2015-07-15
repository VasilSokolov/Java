package Polymorphism;

public class Animals {
	private String name = "Animal";
	public String favFood = "Food";
	
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eatStuff() {
		System.out.println("Yum" + favFood);
	}
	
	//that's the overriding method
	public void walkAround() {
		System.out.println(this.name + " wolk around ");
	}
	
	//create constructor(generics)
	public Animals() {
		
	}
	
    public Animals(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}	
}

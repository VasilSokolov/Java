package Abstraction;

public class ExecutedVehicle {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4, 100.5);
		
		System.out.println("Car max speed " + car.getSpeed());
		System.out.println("Num of wheels " + car.getWheels());
		
		car.setCarStrength(10);
		System.out.println("Car strength " + car.getCarStrength());
		
		//abstract class cannot be instantiated
		//Crashable motor = new Crashable();			
	}
}

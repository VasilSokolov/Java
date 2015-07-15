package Abstraction;

public class Vehicle extends Crashable implements Drivable {
	
	//fields
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;
	
	public int getWheels() {
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;	
	}
	
	public double getSpeed() {
		return this.theSpeed;
	}
	
	public void setSpeed(double speed) {
		this.theSpeed = speed;		
	}	
	
	public Vehicle(int numOfWheels, double theSpeed) {
		this.numOfWheels = numOfWheels;
		this.theSpeed = theSpeed;
	}	
	
    public  void setCarStrength(int carStrength) {
    	this.carStrength = carStrength;
    }
	
	public  int getCarStrength() {
		return this.carStrength;
	}
	
}

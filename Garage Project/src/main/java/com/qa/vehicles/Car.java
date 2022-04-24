package com.qa.vehicles;

public class Car extends Vehicle {
	
//	properties
	private int numOfDoors;
	private int age;
	
//	constructor
	
	public Car(int numOfWheels, int engineSize, boolean importedSparePart, int numOfDoors, int age) {
		super(numOfWheels, engineSize, importedSparePart);
		this.numOfDoors = numOfDoors;
		this.age = age;
	}

	
//	getters and setters
	
	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// method
	@Override
	public double fixCost() {
		if (isImportedSparePart()==true) {
			double cost = (getNumOfWheels()*numOfDoors) + (getAge()*getEngineSize());
			return cost;
		} else if (isImportedSparePart() == false) {
			double cost = (getNumOfWheels()*numOfDoors) * (getAge()*getEngineSize());
			return cost;
		} else {
			double cost = 0;
			return cost;}
		
	
		}

	@Override
	public String toString() {
		return "Car [numOfDoors=" + numOfDoors + ", age=" + age + ", getNumOfWheels()=" + getNumOfWheels()
				+ ", getEngineSize()=" + getEngineSize() + ", isImportedSparePart()=" + isImportedSparePart() + "]";
	}
	

}

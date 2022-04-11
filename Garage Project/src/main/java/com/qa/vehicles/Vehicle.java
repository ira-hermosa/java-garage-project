package com.qa.vehicles;

public abstract class Vehicle {
	
	
//	properties
	private int numOfWheels;
	private int engineSize;
	private boolean importedSparePart;
	public static int increment_id;
	public int vehicle_id;
	
// constructor
	public Vehicle(int numOfWheels, int engineSize, boolean importedSparePart) {
		super();
		this.numOfWheels = numOfWheels;
		this.engineSize = engineSize;
		this.importedSparePart = importedSparePart;
		this.vehicle_id=increment_id;
	}

	
//getters and setters
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public boolean isImportedSparePart() {
		return importedSparePart;
	}

	public void setImportedSparePart(boolean importedSparePart) {
		this.importedSparePart = importedSparePart;
	}

//abstract method
public abstract double fixCost();



}

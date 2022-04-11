package com.qa.vehicles;

public class Motorbike extends Vehicle {
	
//	properties
	private int exhaustSize;
	private double perimeter;
	
	
//	constructor
	public Motorbike(int numOfWheels, int engineSize, boolean importedSparePart, int exhaustSize, double perimeter) {
		super(numOfWheels, engineSize, importedSparePart);
		this.exhaustSize = exhaustSize;
		this.perimeter = perimeter;
	}


//	getters and setters
	public int getExhaustSize() {
		return exhaustSize;
	}

	public void setExhaustSize(int exhaustSize) {
		this.exhaustSize = exhaustSize;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
//method
	@Override
	public double fixCost() {
		if (isImportedSparePart() == true) {
			double cost = (getNumOfWheels()*getEngineSize()) + (perimeter*exhaustSize);
			return cost;
		} else if (isImportedSparePart() == false) {
			double cost = (getNumOfWheels()*getEngineSize()) * (perimeter*exhaustSize);
			return cost;
		} else {
			double cost=0;
			return cost;
		}

}


	@Override
	public String toString() {
		return "Motorbike [exhaustSize=" + exhaustSize + ", perimeter=" + perimeter + ", getNumOfWheels()="
				+ getNumOfWheels() + ", getEngineSize()=" + getEngineSize() + ", isImportedSparePart()="
				+ isImportedSparePart() + "]";
	}
	
}

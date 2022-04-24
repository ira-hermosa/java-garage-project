package com.qa.vehicles;

import java.util.ArrayList;

public class Garage {
	
public ArrayList<Vehicle> myGarage = new ArrayList<>();
	
	
	public String addVehicle(Vehicle vehicle) {
		myGarage.add(vehicle);
		return vehicle.getClass().getSimpleName() + " added to list";
	}
	
	public ArrayList<Vehicle> readAll() {
		return myGarage;	
	}
	
	public double vehicleCost(Vehicle vehicle) {
		return vehicle.fixCost();
	}

	
	public String removeByIndex(int index) {
		myGarage.remove(index);
		return "Vehicle of index: " + index + " has been removed from the list";
	}
	
	
	public String updateVehicle(int index, Vehicle vehicle) {
		 myGarage.set(index, vehicle);
		 return "updated vehicle of index " + index;
		
	}
	
	public String removeAll() {
		myGarage.clear();
		return "All vehicles removed";
	}
	


}

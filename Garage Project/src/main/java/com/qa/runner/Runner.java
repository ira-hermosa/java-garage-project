package com.qa.runner;

import com.qa.vehicles.Car;
import com.qa.vehicles.Garage;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Truck;
import com.qa.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
		
		Garage newGarage = new Garage();
		
		Vehicle car1 = new Car (2, 30, false, 4, 5);
		Vehicle truck1 = new Truck(6, 45, true, 500, 100);
		Vehicle motorbike1 = new Motorbike(2, 15, false, 25, 30.5);
		
		Vehicle car2 = new Car (2, 45, true, 4, 10);
		Vehicle truck2 = new Truck(6, 70, false, 500, 150);
		Vehicle motorbike2 = new Motorbike(2, 20, false, 25, 42.7);
		
		System.out.println(newGarage.addVehicle(motorbike1));
		System.out.println(newGarage.addVehicle(truck1));
		System.out.println(newGarage.addVehicle(car1));
		
		System.out.println(newGarage.readAll());
//		System.out.println(newGarage.removeByIndex(0));
//		System.out.println(newGarage.updateVehicle(1, motorbike2));
			

	}

}

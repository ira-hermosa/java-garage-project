package com.qa.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.qa.vehicles.Car;
import com.qa.vehicles.Garage;
import com.qa.vehicles.Motorbike;
import com.qa.vehicles.Truck;
import com.qa.vehicles.Vehicle;


@TestInstance(Lifecycle.PER_CLASS)

public class GarageTest {
	
	Garage testGarage = new Garage();
	
	Vehicle car1 = new Car (2, 30, false, 4, 5);
	Vehicle truck1 = new Truck(6, 45, true, 500, 100);
	Vehicle motorbike1 = new Motorbike(2, 15, false, 25, 30.5);
	
	Vehicle car2 = new Car (2, 45, true, 4, 10);
	Vehicle truck2 = new Truck(6, 70, false, 500, 150);
	Vehicle motorbike2 = new Motorbike(2, 20, false, 25, 42.7);
	
	
	@BeforeAll
	public void setup() {
		testGarage.addVehicle(car1);
		testGarage.addVehicle(truck1);
		testGarage.addVehicle(motorbike1);
		testGarage.addVehicle(car2);
		testGarage.addVehicle(truck2);
		testGarage.addVehicle(motorbike2);
	}
	
	@Test
	public void addTest() {
		
		String result;
		result = testGarage.addVehicle(car2);
		System.out.println(result);
		Assertions.assertEquals("Car added to list", result);
		
	}
	
	@Test
	public void readAllTest() {
		String result;
		result = testGarage.readAll().toString();
		Assertions.assertEquals("[Motorbike [exhaustSize=25, perimeter=30.5, getNumOfWheels()=2, getEngineSize()=15, isImportedSparePart()=false], Truck [numOfKilometers=500, weightCapacity=100, getNumOfWheels()=6, getEngineSize()=45, isImportedSparePart()=true], Car [numOfDoors=4, age=5, getNumOfWheels()=2, getEngineSize()=30, isImportedSparePart()=false]]", result);
		
	}
	
	@Test
	public void vehicleCostTest() {
		double result;
		result = testGarage.vehicleCost(0);
		Assertions.assertEquals(null, result);
	}
	
	@Test
	public void removeByIndexTest() {
		int index = 1;
		String result;
		result = testGarage.removeByIndex(index);
		Assertions.assertEquals(null, result);
	}
	
	@Test
	public void updateVehicleTest() {
		int index = 2;
		String result;
		result = testGarage.updateVehicle(index, car1);
		Assertions.assertEquals("updated vehicle of index 2", result);
		
	}
	
	@Test
	public void removeAllTest() {
		String result;
		result = testGarage.removeAll();
		Assertions.assertEquals("All vehicles removed", result);
	}
	

}

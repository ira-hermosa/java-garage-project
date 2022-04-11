package com.qa.vehicles;

public class Truck extends Vehicle {
	
	//properties
		private int numOfKilometers;
		private int weightCapacity;
		
//		constructor
		public Truck(int numOfWheels, int engineSize, boolean importedSparePart, int numOfKilometers, int weightCapacity) {
			super(numOfWheels, engineSize, importedSparePart);
			this.numOfKilometers = numOfKilometers;
			this.weightCapacity = weightCapacity;
		}

//		getters and setters
		public int getNumOfKilometers() {
			return numOfKilometers;
		}

		public void setNumOfKilometers(int numOfKilometers) {
			this.numOfKilometers = numOfKilometers;
		}

		public int getWeightCapacity() {
			return weightCapacity;
		}

		public void setWeightCapacity(int weightCapacity) {
			this.weightCapacity = weightCapacity;
		}

//		method
		
		@Override
		public double fixCost() {
			
			if (isImportedSparePart()==true) {
				double cost = (getNumOfWheels()*weightCapacity) + (getEngineSize()*numOfKilometers);
				return cost;
			} else if (isImportedSparePart()==false) {
				double cost = (getNumOfWheels()*weightCapacity) * (getEngineSize()*numOfKilometers);
				return cost;
			} else {
				double cost = 0;
				return cost;
				
			}
				
		}

		@Override
		public String toString() {
			return "Truck [numOfKilometers=" + numOfKilometers + ", weightCapacity=" + weightCapacity
					+ ", getNumOfWheels()=" + getNumOfWheels() + ", getEngineSize()=" + getEngineSize()
					+ ", isImportedSparePart()=" + isImportedSparePart() + "]";
		}
		

		
		
	}
		



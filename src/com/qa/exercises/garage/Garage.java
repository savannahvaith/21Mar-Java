package com.qa.exercises.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehicles = new ArrayList<>();
	
	// add vehicle
	public boolean addVehicle(Vehicle v) {
		return this.vehicles.add(v);
	}
	
	// remove vehicle from list:
	public boolean removeVehicle(Vehicle v) {
		return this.vehicles.remove(v);
	}
	
	// empty the garage:
	public void emptyGarage() {
		this.vehicles.clear(); 
	}

	// print each vehicle in the list:
	public void printVehicles() {
		for(Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
	
	// calculate the bill
	public float calcBill() {
		float bill = 0f; 
		for(Vehicle v : vehicles) {
			bill += v.calculateBill();
		}
		return bill; 
	}
	
	// remove vehicles by TYPE = CAR BOAT PLANE
	
	public void removeVehiclesByType(Class<?> clazzy) {
		List<Vehicle> toRemove = new ArrayList<>(); 
		for(Vehicle v : vehicles) {
			if( v.getClass() == clazzy) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}
	
	

}

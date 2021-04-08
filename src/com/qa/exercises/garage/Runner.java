package com.qa.exercises.garage;

public class Runner {

	
	public static void main(String[] args) {
		
		Boat titanic = new Boat(0,"automatic",255,"spins");
		
		Garage g = new Garage(); 
		
		g.addVehicle(titanic); // true/false
		g.addVehicle(new Car(4,"automatic",165,2));
		g.addVehicle(new Car(3,"manual",165,2));
		g.addVehicle(new Car(3,"automatic",123,2));
		g.addVehicle(new Car(3,"manual",111,2));
		
		g.printVehicles(); // titanic, car
		
		// print total bill:
		System.out.println(g.calcBill());
		
		g.removeVehiclesByType(Car.class);
		
		g.printVehicles();
		
	}
}

package com.tiy.ssa.locomotion;

import java.util.ArrayList;

public class Vehicle {

	protected boolean hasBrakes = false;
	protected boolean hasEngine = false;
	protected boolean hasWheels = false;
	protected boolean doesItRun = false;
	
	
	
	public boolean isHasBrakes() {
		return hasBrakes;
	}



	public void setHasBrakes(boolean hasBrakes) {
		this.hasBrakes = hasBrakes;
	}



	public boolean isHasEngine() {
		return hasEngine;
	}



	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}



	public boolean isHasWheels() {
		return hasWheels;
	}



	public void setHasWheels(boolean hasWheels) {
		this.hasWheels = hasWheels;
	}



	public boolean isDoesItRun() {
		return doesItRun;
	}



	public void setDoesItRun(boolean doesItRun) {
		this.doesItRun = doesItRun;
	}


	public Vehicle(boolean hasBrakes, boolean hasEngine, boolean hasWheels, boolean doesItRun) {
		super();
		this.hasBrakes = hasBrakes;
		this.hasEngine = hasEngine;
		this.hasWheels = hasWheels;
		this.doesItRun = doesItRun;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Vehicle> carCollection = new ArrayList<Vehicle>();
		
		Car carOne = new Car(true, true, true, true, 6, 4, "pink", "Ferrari", "Diablo", false, true);
		
		carCollection.add(carOne);
		
		System.out.println("Testing output results in a car of " + carCollection.toString());

		
	}



	public Vehicle() {
		super();
	}




}

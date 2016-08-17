package com.tiy.ssa.locomotion;

public class Car extends Vehicle{

	private int numberWindows = 0;
	private int doors = 0;
	private String color = null;
	private String make = null;
	private String model = null;
	private boolean doesItMove = false;
	private boolean isItFast = false;
	public Car(boolean hasBrakes, boolean hasEngine, boolean hasWheels, boolean doesItRun, int numberWindows, int doors,
			String color, String make, String model, boolean doesItMove, boolean isItFast) {
		super(hasBrakes, hasEngine, hasWheels, doesItRun);
		this.numberWindows = numberWindows;
		this.doors = doors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.doesItMove = doesItMove;
		this.isItFast = isItFast;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [numberWindows=" + numberWindows + ", doors=" + doors + ", color=" + color + ", make=" + make
				+ ", model=" + model + ", doesItMove=" + doesItMove + ", isItFast=" + isItFast + ", hasBrakes="
				+ hasBrakes + ", hasEngine=" + hasEngine + ", hasWheels=" + hasWheels + ", doesItRun=" + doesItRun
				+ "]";
	}
	


}

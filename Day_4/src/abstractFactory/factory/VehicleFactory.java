package abstractFactory.factory;

import abstractFactory.model.car.Car;
import abstractFactory.model.motorcycle.Motorcycle;

public abstract class VehicleFactory {
	public VehicleFactory() {
		
	}
	
	public abstract Car createCar();
	public abstract Motorcycle createMotorcycle();
}

package abstractFactory.factory;

import abstractFactory.model.car.Car;
import abstractFactory.model.car.HondaCar;
import abstractFactory.model.motorcycle.Motorcycle;
import abstractFactory.model.motorcycle.HondaMotorcycle;

public class HondaFactory extends VehicleFactory{
	public HondaFactory() {}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new HondaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new HondaMotorcycle();
	}
	
	
}

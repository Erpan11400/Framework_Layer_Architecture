package abstractFactory.factory;

import abstractFactory.model.car.Car;
import abstractFactory.model.car.ToyotaCar;
import abstractFactory.model.motorcycle.Motorcycle;
import abstractFactory.model.motorcycle.ToyotaMotorcycle;

public class ToyotaFactory extends VehicleFactory {
	public ToyotaFactory() {}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new ToyotaCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new ToyotaMotorcycle();
	}
}

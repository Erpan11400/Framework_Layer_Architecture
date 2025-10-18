package abstractFactory.factory;

import abstractFactory.model.car.Car;
import abstractFactory.model.car.HyundaiCar;
import abstractFactory.model.motorcycle.HyundaiMotorcycle;
import abstractFactory.model.motorcycle.Motorcycle;

public class HyundaiFactory extends VehicleFactory {
	public HyundaiFactory() {}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new HyundaiCar();
	}

	@Override
	public Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new HyundaiMotorcycle();
	}
	
	
}

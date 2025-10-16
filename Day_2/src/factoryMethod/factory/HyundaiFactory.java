package factoryMethod.factory;

import factoryMethod.model.Car;
import factoryMethod.model.HyundaiCar;

public class HyundaiFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new HyundaiCar();
	}

}

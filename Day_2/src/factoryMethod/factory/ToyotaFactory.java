package factoryMethod.factory;

import factoryMethod.model.Car;
import factoryMethod.model.ToyotaCar;

public class ToyotaFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new ToyotaCar();
	}

}

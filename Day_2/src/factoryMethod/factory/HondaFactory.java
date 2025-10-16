package factoryMethod.factory;

import factoryMethod.model.Car;
import factoryMethod.model.HondaCar;

public class HondaFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new HondaCar();
	}

}

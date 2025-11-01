package facade;

import model.Chef;
import model.Waiter;

public class OrderFacade {
	private Chef chef;
	private Waiter waiter;
	
	public OrderFacade(Waiter waiter, Chef chef) {
		this.waiter = waiter;
		this.chef = chef;
	}
	
	public void order() {
		waiter.getOrder();
		chef.getOrder();
		chef.prepareFood();
		waiter.getFood();
		waiter.serveFood();
	}
}

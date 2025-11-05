package facade;
import facade.model.Chef;
import facade.model.Waiter;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	Main() {
		OrderFacade orderFacade = new OrderFacade(new Waiter(), new Chef());
		
		orderFacade.order();
	}
}

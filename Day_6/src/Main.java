import facade.OrderFacade;
import model.Chef;
import model.Waiter;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	Main() {
		OrderFacade orderFacade = new OrderFacade(new Waiter(), new Chef());
		
		orderFacade.order();
	}
	
	

}

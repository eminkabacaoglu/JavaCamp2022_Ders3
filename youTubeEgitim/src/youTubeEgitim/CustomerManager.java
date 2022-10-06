package youTubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private BaseCreditManager creditManager;
	
	public CustomerManager(Customer customer, BaseCreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Customer Saved: ");
	}
	
	public void delete() {
		System.out.println("Customer Removed");
	}
	
	public void giveCredit() {
		System.out.println("Customer is given credit: ");
		creditManager.calculate();
	}
}

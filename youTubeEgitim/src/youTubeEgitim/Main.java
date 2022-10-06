package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();

        Company company = new Company();
        company.setId(100);
        company.setCompanyName("Bosch");
        company.setTaxNumber("1235469871");

        CustomerManager customerManager2 = new CustomerManager(company, new TeacherCreditManager());
        customerManager2.giveCredit();

        Person person = new Person();
        person.setId(12);
        person.setCity("Ankara");
        person.setFirstName("Emin");
        person.setLastName("Kabacaoglu");
        person.setNationalIdentity("999999");
        

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();
        
        CreditManager creditManager = new MilitaryCreditManager();
        creditManager.calculate();
        creditManager.save();


	}

}


package constructions;

	public class customerTest {
	    public static void main(String[] args) {
	        customer Jefferson = new customer ("Jefferson", 5000, 123456, "jeff@gmail.com");

	        Jefferson.customerDebt();
	        Jefferson.customerId();

	        Jefferson.setDebt(3000);
	        Jefferson.customerDebt();

	        System.out.println(Jefferson.getDebt());
	    }
	}
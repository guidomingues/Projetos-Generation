package deusmeajuda;


public class supplierTest {
	public static void main (String[] args) {
		
		classPersonSupplier []supplierList = new classPersonSupplier [3];
		supplierList [0] = new classPersonSupplier ("Guilherme Pereira\n","Paulista Avenue\n","123456789\n","Male\n", 2020,5000,1500);
		supplierList [1] = new classPersonSupplier ("Gustavo Borges\n","Oscar Freire street\n","987654321\n","Male\n", 2010,3500,2400);
		supplierList [2] = new classPersonSupplier ("Gabriel Ramos\n","Bexiga street\n","543216789\n", "Male\n", 2030,12000,7500);
	
		for (int i=0;i<3;i++) {
			supplierList [i].imprimirInfo();
			supplierList [i].Obtersaldo(0);
		}
	
		

	}
	

}

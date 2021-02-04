package deusmeajuda;

public class classPersonSupplier extends classPerson{
	private float creditamount; 
	private float debtamount; 	
	public classPersonSupplier (String name, String address, String phone, String gener, int id,float creditamount, float debtamount) {
		super (name,address,phone);
		this.creditamount = creditamount;
		this.debtamount = debtamount;
		}
	
	public void Obtersaldo(float saldo) {
		saldo = (creditamount - debtamount);
		System.out.println("Your credit is: "+saldo);
	}
	
	public double getbalance() {
		return (creditamount - debtamount);
	}
	

	public float getCreditamount() {
		return creditamount=debtamount;
	}

	public void setCreditamount(float creditamount) {
		this.creditamount = creditamount;
	}

	public float getDobtamount() {
		return debtamount;
	}

	public void setDobtamount(float debtamount) {
		this.debtamount = debtamount;
	}
	
	 

}

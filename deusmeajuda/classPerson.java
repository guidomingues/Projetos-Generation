package deusmeajuda;

public class classPerson {
	private String name; 
	private String address; 
	private String phone; 
	
	
	
	
	public classPerson (String name, String address, String phone) {
		this.name = name; 
		this.address = address; 
		this.phone = phone;
	
	}
	
	public void imprimirInfo() {
		System.out.println(name+" lives on "+address+ " his cellphone is "+phone+ " his gener is ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	
}

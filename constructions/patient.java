package constructions;

public class patient {
	private String name; 
	private String hospital; 
	private String address; 
	private int id; 
	private int number; 
	
	public patient (String name, String hospital, String address, int id, int number) {
		this.name = name;
		this.hospital = hospital; 
		this.address = address;
		this.id = id; 
		this.number = number; 
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

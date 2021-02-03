package constructions;

public class funcionario {
	private String name; 
	private String company; 
	private int age;
	private int id; 
	
	public funcionario (String name, String company, int age, int id){
		this.name = name;
		this.company = company; 
		this.age = age; 
		this.id = id; 
	}
	public void funcionarioName () {
		if (age<18 && age >65) {
			System.out.println (name+" Sorry, you can not work here"+age);
		}else {
				System.out.println(name+" Yeah, you are welcome to "+company); 
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}

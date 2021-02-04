package Polimorfismo;

public abstract class animal { 
	private String name; 
	private int age; 
	private String makeASound; 
	private String mustRun;

	public animal (String name,int age, String makeASound, String mustRun) {
		this.name = name; 
		this.age = age;
		this.makeASound = makeASound; 
		this.mustRun = mustRun;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMakeASound() {
		return makeASound;
	}
	public void setMakeASound(String makeASound) {
		this.makeASound = makeASound;
	}
	public String getMustRun() {
		return mustRun;
	}
	public void setMustRun(String mustRun) {
		this.mustRun = mustRun;
	} 

}

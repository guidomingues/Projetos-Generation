package Polimorfismo;

public class sloth extends animal {
	
	public sloth (String name,int age, String makeASound, String mustRun) {
		super (name,age,makeASound,mustRun);	
	}
	
	@Override
	public String getMakeASound() {
		return "zZZZZZzzzzzzzzzZZZZZzzzZ";
	}
}

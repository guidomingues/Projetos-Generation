package Polimorfismo;

public class horse extends animal {

	public horse (String name,int age, String makeASound, String mustRun) {
		super (name,age,makeASound,mustRun);
	}
	@Override
	public String getMakeASound() {
		return "AAAAARiiiiiimmmm";
	}
	
}
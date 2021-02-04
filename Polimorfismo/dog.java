package Polimorfismo;

public class dog  extends animal {
	
	public dog (String name,int age, String makeASound, String mustRun) {
		super (name,age,makeASound,mustRun);
		}
	@Override 
	public String getMakeASound() {
		return "AuAuauuauauauauauauu";	
	}
}


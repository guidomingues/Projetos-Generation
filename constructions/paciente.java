package constructions;

public class paciente {
	public static void main(String []args) {
		patient[]  pacienteList = new patient [3];
		pacienteList [0] = new patient ("Pablo Escobar", "Mandaqui", "Colômbia", 33, 123456 ); 
		pacienteList [1] = new patient ("Amilo Carrilo Fuentes", "Penteado", "México", 33, 9876); 
		pacienteList [2] = new patient ("Khun San", "Albert Einsten", "New York",33,76543);
	System.out.println (pacienteList[0].getName()+" - "+pacienteList[0].getHospital()+" - "+pacienteList[0].getAddress()+" - "+pacienteList[0].getId()+" - "+pacienteList[0].getNumber());;
	System.out.println (pacienteList[1].getName()+" - "+pacienteList[1].getHospital()+" - "+pacienteList[1].getAddress()+" - "+pacienteList[1].getId()+" - "+pacienteList[1].getNumber());;
	System.out.println (pacienteList[2].getName()+" - "+pacienteList[2].getHospital()+" - "+pacienteList[2].getAddress()+" - "+pacienteList[2].getId()+" - "+pacienteList[2].getNumber());;
	}
}

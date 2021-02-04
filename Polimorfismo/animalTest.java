package Polimorfismo;

import java.util.Scanner;
public class animalTest {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		dog cao = new dog("Spike",3,"auauau","running");
		horse cavalo = new horse ("Sugar foot",10,"AArim","run");
		sloth preguica = new sloth ("jreguica",20,"Aaaah","no"); 
		
		String nameOfTheDog, ageOfTheDog, mustRunDog; 
		System.out.print("Enter the dog's name: ");
		nameOfTheDog = leia.next();
		System.out.print("Enter the age of the dog: ");
		ageOfTheDog = leia.next();
		System.out.print("What should dog does: ");
		mustRunDog = leia.next();
		cao.setName(nameOfTheDog);
		
		String nameOfTheHorse,ageOfTheHorse, mustRunHorse; 
		System.out.print("\nEnter the horse's name: ");
		nameOfTheHorse = leia.next();
		System.out.print("Enter the age of the horse: ");
		ageOfTheHorse = leia.next();
		System.out.print("What should horse does: ");
		mustRunHorse = leia.next();
		cavalo.setName(nameOfTheHorse);
		
		String nameOfTheSloth,ageOfTheSloth, mustRunSloth; 
		System.out.print("\nEnter the sloth's name: ");
		nameOfTheSloth = leia.next();
		System.out.print("Enter the age of the sloth");
		ageOfTheSloth = leia.next();
		System.out.print("What should sloth does:\n");
		mustRunSloth = leia.next();
		preguica.setName(nameOfTheSloth);
		
		
		System.out.println ( "The dog's noise is: " +cao.getMakeASound()+"\nThe horse's noise is: "+cavalo.getMakeASound()+"\nThe sloth's noise is: "+preguica.getMakeASound());
		}
}

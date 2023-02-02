package Exercies2;

import java.util.Scanner;

public class Exercies2 {

	public Exercies2() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("Veillez entrez le décalage horaire entre votre domicile et votre destination" +
				"\n Vous pouver entre un nombre negative");
		
		Scanner scanner  = new Scanner(System.in);
		int decallaHoraire = scanner.nextInt();
		
		int heurDestinationNuit = decallaHoraire < 0 ? 24 + decallaHoraire : decallaHoraire ;
		
		int heurDestinationoJour = 12 + decallaHoraire;
		
		System.out.println("Il sera " + heurDestinationoJour + " H lorsqu'il sera 12 heure et il sera" + 
				"\n" + heurDestinationNuit + " H lorsqu'il sera 00 heure");


	}

}

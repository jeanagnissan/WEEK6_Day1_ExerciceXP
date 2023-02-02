package Exercice1;

import java.util.Scanner;

public class Exercies1 {

	public Exercies1() {
		super();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez le 1er angle");
		double angle1 = scanner.nextDouble();

		System.out.println("Entrez le 2ème angle");
		double angle2 = scanner.nextDouble();

		System.out.println("Entrez le 3ème angle");
		double angle3 = scanner.nextDouble();

		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("C'est un triangle valide");
		} else {
			System.out.println("Ce n'est pas un triangle valide");
		}

	}

}

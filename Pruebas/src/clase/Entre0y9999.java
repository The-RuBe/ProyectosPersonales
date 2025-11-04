package clase;

import java.util.Scanner;

public class Entre0y9999 {

	public static void main(String[] args) {

		int num1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();

		if (num1 >= 0 && num1 <= 9999) {
			System.out.println("El número entra entre 0 y 9999.");

		} else {
			System.out.println("El número no entra entre 0 y 9999.");
		}

		sc.close();

	}

}
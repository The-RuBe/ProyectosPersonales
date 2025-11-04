package clase;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
	int num1;
	int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		
		if(num1-num2==0) {
			System.out.println("Los números son iguales.");
			
		}else
			System.out.println("Los números no son iguales.");
		
		sc.close();
	}
}
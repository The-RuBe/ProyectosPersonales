package calculadoraHucha;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Introduce las monedas de 2 euros: ");

int dosEuros = sc.nextInt();

System.out.println("Introduce las monedas de 1 euro: ");

int unEuro = sc.nextInt();

System.out.println("Introduce las monedas de 50 céntimos: ");

int cent50 = sc.nextInt();

System.out.println("Introduce las monedas de 20 céntimos: ");

int cent20 = sc.nextInt();

System.out.println("Introduce las monedas de 10 céntimos: ");

int cent10 = sc.nextInt();

System.out.println("Introduce las monedas de 5 céntimos: ");

int cent5 = sc.nextInt();

System.out.println("Introduce las monedas de 2 céntimos: ");

int cent2 = sc.nextInt();

System.out.println("Introduce las monedas de 1 céntimo: ");

int cent1 = sc.nextInt();

Calculadora m = new Calculadora(dosEuros, unEuro, cent50, cent20, cent10, cent5, cent2, cent1);

m.calcularTotalEuros();

sc.close();

}

}
package calculadoraHucha;

public class Calculadora {

//Atributos

private int dosEuros;

private int unEuro;

private int cent50;

private int cent20;

private int cent10;

private int cent5;

private int cent2;

private int cent1;

//Constructor

public Calculadora(int dosEuros, int unEuro, int cent50, int cent20, int cent10, int cent5, int cent2, int cent1) {

this.dosEuros = dosEuros;

this.unEuro = unEuro;

this.cent50 = cent50;

this.cent20 = cent20;

this.cent10 = cent10;

this.cent5 = cent5;

this.cent2 = cent2;

this.cent1 = cent1;
}

//Método para calcular y mostrar el dinero total en euros y céntimos sin mostrar decimales

public void getDosEuros() {

System.out.println(dosEuros);

}

public void setDosEuros(int dosEuros) {

this.dosEuros = dosEuros;

}

public void getUnEuro() {

System.out.println(unEuro);

}

public void setUnEuro(int unEuro) {

this.unEuro = unEuro;

}

public void getCent50() {

System.out.println(cent50);

}

public void setCent50(int cent50) {

this.cent50 = cent50;

}

public void getCent20() {

System.out.println(cent20);

}

public void setCent20(int cent20) {

this.cent20 = cent20;

}

public void getCent10() {

System.out.println(cent20);

}

public void setCent10(int cent10) {

this.cent10 = cent10;

}

public void getCent5() {

System.out.println(cent5);

}

public void setCent5(int cent5) {

this.cent5 = cent5;

}

public void getCent2() {

System.out.println(cent2);

}

public void setCent2(int cent2) {

this.cent2 = cent2;

}

public void getCent1() {

System.out.println(cent1);

}

public void setCent1(int cent1) {

this.cent1 = cent1;

}

public void calcularTotalEuros() {

int centimosTotales = this.dosEuros * 200 + this.unEuro * 100 + this.cent50 * 50 + this.cent20 * 20 + this.cent10 * 10 + this.cent5 * 5 + this.cent2 * 2 + this.cent1;

int euros = centimosTotales / 100;

int centimos = centimosTotales % 100;

System.out.printf("Total: %d € y %d céntimos \n", euros, centimos);

}

}
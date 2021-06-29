package aula073;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double dollarPrice, dollarBuy;

		System.out.println("Preco do dolar?");
		dollarPrice = sc.nextDouble();

		System.out.println("Quantos dollars deseja comprar?");
		dollarBuy = sc.nextDouble();

		System.out.println(" Valor: " + CurrencyConverter.calculator(dollarPrice, dollarBuy));

		sc.close();
	}

}

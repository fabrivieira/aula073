package aula073;

public class CurrencyConverter {
	
	public static final double IOF = 6.00D;
	
	public static double calculator(double reais, double dolar) {
		return reais * dolar +  reais * dolar * IOF / 100;
	}
}

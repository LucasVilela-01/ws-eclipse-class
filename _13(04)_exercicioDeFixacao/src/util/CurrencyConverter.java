package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double dolarToReal(double price, double dolar) {
		return price * dolar * (1 + IOF);
	}
	
}
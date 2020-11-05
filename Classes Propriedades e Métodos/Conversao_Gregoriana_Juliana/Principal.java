package Conversao_Gregoriana_Juliana;

public class Principal {

	public static long conversao (int dia, int mes, int ano) {
		
		long data = dia + mes + ano;
		long base = 15 + 10 + 1582;
		if (mes < 3) {
			ano -= 1;
			mes += 12;
		}
		
		if (data >= base) {
			double a = ano / 100;
			double b = a / 4;
			double c = 2 - a + b;
			double d = 365.25 * (ano + 4716);
			double e = 30.6001 * mes + 1;
			double dataju = (d + e + dia + 0.5 + c - 1524.5) + 30;
			if (dataju % 1 == 0) {
				dataju -= 1;
			}
			return (int) dataju;
		}
		return data;
	}

	
	public static void main(String[] args) {
		System.out.println(conversao(5, 8, 2016));
	}
	
}

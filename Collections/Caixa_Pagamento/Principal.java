package Caixa_Pagamento;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Dinheiro", "Pago R$ %f em dinheiro");
		map.put("Cartao Debito", "Pago R$ %f em cartao de debito");
		map.put("Cartao de Credito", "Foi utilizado R$ %f do limite do cartao de credito");
		map.put("Cheque", "Pago R$ %f em cheque");
		map.put("Deposito", "Pago R$ %f em deposito bancario");
		
		System.out.println("Insira a forma de pagamento");
		String key = scan.nextLine();
		System.out.println("Insira o valor do pagamento");
		float valor = Float.parseFloat(scan.nextLine());
		System.out.printf(map.get(key), valor);
	}

}

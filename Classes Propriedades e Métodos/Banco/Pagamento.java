package Banco;

import java.util.Date;

public class Pagamento extends Transacao {

	private String boleto;
	
	public Pagamento(String boleto, double valor, Date data) {
		super(valor, data);
		this.boleto = boleto;
	}
	
}

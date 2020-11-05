package Banco;

import java.util.Date;

public class Conta {
	
	private double saldo;
	private String numero;
	private String senha;
	private Transacao [] historico;
	
	public Conta(double saldo, String numero, String senha, Transacao[] historico) {
		this.saldo = saldo;
		this.numero = numero;
		this.senha = senha;
		this.historico = historico;
	}
	
	
	public boolean efetuarSaque(double valor) {
		System.out.println("Efetuando saque");
		return true;
	}
	
	
	public boolean efetuarDeposito(double valor) {
		System.out.println("Efetuando deposito");
		return true;
	}
	
	
	public boolean efetuarPagamento(String boleto, double valor) {
		System.out.println("Efetuando pagamento");
		return true;
	}
	
	
	public Transacao [] extrato(Date inicio, Date fim) {
		System.out.println("Gerando extrato");
		return null;
	}

}
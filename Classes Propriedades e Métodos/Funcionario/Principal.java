package Funcionario;

import java.text.ParseException;

public class Principal {
	
	public static void main(String[] args) {
		GestaoFuncionarios gf = new GestaoFuncionarios();
		try {
			gf.menu();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

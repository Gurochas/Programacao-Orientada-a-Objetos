package Bonus_Funcionario;

import java.util.Scanner;

public class Empresa {
	
	private RH rh;
	

	public Empresa() {
		rh = new RH();
	}
	
	public RH getRh() {
		return rh;
	}

	public Funcionario contratarFuncionario() {
		Funcionario f = new Funcionario();
		
		Scanner scn = new Scanner(System.in);
		
		f.setId(rh.qtdFuncionarios());
		
		System.out.println("Digite o nome do funcionario");
		f.setNome(scn.nextLine());
		
		System.out.println("Digite a matricula do funcionario");
		f.setMatricula(scn.nextLine());
		
		System.out.println("Digite o salario do funcionario");
		f.setSalario(Double.parseDouble(scn.nextLine()));
		
		System.out.println("Digite as faltas no ano do funcionario");
		f.setFaltasNoAno(Integer.parseInt(scn.nextLine()));
		
		System.out.println("Digite a ultima nota de avaliação do funcionario");
		f.setUltimaNotaAvaliacao(Integer.parseInt(scn.nextLine()));
		
		return f;
	}
	
	
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		for(int i = 0; i < 5; i++) {
			Funcionario f = empresa.contratarFuncionario();
			empresa.getRh().adicionarFuncionario(f);
		}
	}
	
}

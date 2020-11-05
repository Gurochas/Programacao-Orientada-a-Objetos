package Bonus_Funcionario;

import java.util.LinkedList;
import java.util.List;

public class RH {
	
	List<Funcionario> funcionarios;

	public RH() {
		funcionarios = new LinkedList<>();
	}
	
	public double valorBonus(Funcionario funcionario) {
		if (funcionario.getFaltasNoAno() < 2) {
			return 0.3;
		}
		if(funcionario.getFaltasNoAno() <= 4) {
			return 0.15;
		}else {
			return 0.05;
		}
	}
	
	public void mostrarBonusTodosFuncionarios() {
		System.out.println("Os bonus recebidos são: ");
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " --> " + (valorBonus(f)*100) + "%");
		}
	}
	
	public void adicionarFuncionario(Funcionario f) {
		funcionarios.add(f);
		System.out.println("Funcionario registrado com sucesso");
	}
	
	public void removerFuncionario(Funcionario f) {
		funcionarios.remove(f);
		System.out.println("Funcionario removido com sucesso");
	}
	
}

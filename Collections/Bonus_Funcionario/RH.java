package Bonus_Funcionario;

import java.util.LinkedList;
import java.util.List;

public class RH {
	
	List<Funcionario> funcionarios;

	public RH() {
		funcionarios = new LinkedList<>();
	}
	
	public double valorBonus(Funcionario funcionario) {
		double bonus = calcAval(funcionario);
		if (funcionario.getFaltasNoAno() < 2) {
			bonus += 0.3;
		}else if(funcionario.getFaltasNoAno() <= 4) {
			bonus += 0.15;
		}else {
			bonus += 0.05;
		}
		return bonus;
	}
	
	private double calcAval (Funcionario funcionario) {
		if (funcionario.getUltimaNotaAvaliacao() < 5) {
			return 0.05;
		}
		if(funcionario.getUltimaNotaAvaliacao() <= 7) {
			return 0.15;
		}else {
			return 0.3;
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
	
	public int qtdFuncionarios () {
		return funcionarios.size();
	}
	
}

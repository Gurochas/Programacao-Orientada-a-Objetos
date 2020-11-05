package Bonus_Funcionario;

public class TesteRH {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(1, "Roberto", "1", 1000, 1, 7.0f, 2, true, "Fatec Zona Leste", "ADS");
		Funcionario f2 = new Funcionario(1, "Jorge", "1", 1600, 3, 7.0f, 2, true, "Fatec Zona Leste", "ADS");
		Funcionario f3 = new Funcionario(1, "Maria", "1", 3000, 4, 7.0f, 2, true, "Fatec Zona Leste", "ADS");
		Funcionario f4 = new Funcionario(1, "Ana", "1", 4500, 5, 7.0f, 2, true, "Fatec Zona Leste", "ADS");
		
		RH rh = new RH();
		
		rh.adicionarFuncionario(f1);
		rh.adicionarFuncionario(f2);
		rh.adicionarFuncionario(f3);
		rh.adicionarFuncionario(f4);
		
		rh.removerFuncionario(f3);
		
		rh.mostrarBonusTodosFuncionarios();
		
	}
}

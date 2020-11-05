package Aeroporto;

public class Principal {

	public static void main(String[] args) {
		/*-----------Pessoa------------*/
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome("Roberto");
		p1.setSexo("Homem");
		p1.setIdade(20);
		p1.respirar();
		p2.setNome("Ana");
		p2.setSexo("Mulher");
		p2.setIdade(21);
		p2.respirar();
		
		/*-----------Passageiro------------*/
		Passageiro pa1 = new Passageiro();
		Passageiro pa2 = new Passageiro();
		pa1.setNome("Roberto");
		pa1.setSexo("Homem");
		pa1.setIdade(53);
		pa1.setNumero_de_bagagens(5);
		pa1.setNum_passagem("BR19203LBAASDHA");
		pa1.setTipo_passagem("Comum");
		pa1.viajar();

		pa2.setNome("Amanda");
		pa2.setSexo("Mulher");
		pa2.setIdade(19);
		pa2.setNumero_de_bagagens(2);
		pa2.setNum_passagem("BR123910OOPAODF");
		pa2.setTipo_passagem("Primeira classe");
		pa2.viajar();
		
		/*-----------Aeronave------------*/
		Aeronave nave1 = new Aeronave();
		Aeronave nave2 = new Aeronave();
		nave1.setCompanhia("GO");
		nave1.setMarca("Boing");
		nave1.setModelo("legal");
		nave1.voa();
		
		nave2.setCompanhia("LATAM");
		nave2.setMarca("Jato");
		nave2.setModelo("Divertido");
		nave2.voa();
		
		/*-----------Piloto------------*/
		Piloto pl1 = new Piloto();
		Piloto pl2 = new Piloto();
		pl1.setNome("Robson");
		pl1.setSexo("Homem");
		pl1.setIdade(38);
		pl1.setAviao(nave1);
		pl1.setId(10003);
		pl1.setNacionalidade("Brasileiro");
		pl1.pilotar();
		
		pl1.setNome("Amanda");
		pl1.setSexo("Mulher");
		pl1.setIdade(43);
		pl1.setAviao(nave2);
		pl1.setId(10008);
		pl1.setNacionalidade("Brasileiro");
		pl2.pilotar();
		
		/*-----------Aeroporto------------*/
		Aeroporto a1 = new Aeroporto();
		Aeroporto a2 = new Aeroporto();
		a1.setCapacidade(1000);
		a1.setNome("Guarulhos");
		a1.setNumero_de_pistas(30);
		a1.planejarVoo();
		
		a2.setCapacidade(500);
		a2.setNome("Capinas");
		a2.setNumero_de_pistas(10);
		a2.planejarVoo();
	}

}

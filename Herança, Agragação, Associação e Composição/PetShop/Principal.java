package PetShop;

public class Principal {
	
	public static void main(String[] args) {
		
		/*-----------Pessoa------------*/
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Roger");
		p1.setIdade(23);
		p1.setSexo("Masculino");
		p1.respirar();
		
		p2.setNome("Barbara");
		p2.setIdade(26);
		p2.setSexo("Feminino");
		p2.respirar();
		
		/*-----------Dono------------*/
		Dono d1 = new Dono();
		Dono d2 = new Dono();
		
		d1.setNome("Mauricio");
		d1.setIdade(53);
		d1.setSexo("Masculino");
		d1.setTelefone("998351564");
		d1.levarPet();
		
		d2.setNome("Amanda");
		d2.setIdade(32);
		d2.setSexo("Feminino");
		d2.setTelefone("9435551634");
		d2.levarPet();
		
		/*-----------Doença----------*/
		Doenca dn1 = new Doenca();
		Doenca dn2 = new Doenca();
		
		dn1.setId(879);
		dn1.setNome("Pulga");
		dn1.setDescrição("Bixin que pula");
		dn1.espalhar();
		
		dn2.setId(878);
		dn2.setNome("Purga");
		dn2.setDescrição("Bixin que morde");
		dn2.espalhar();
		
		/*----------Animal-----------*/
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1.setNome("Beto");
		a1.setSexo("Masculino");
		a1.setDoenca(dn1);
		a1.setDono(d1);
		a1.comer();
		
		a2.setNome("Bianca");
		a2.setSexo("Feminino");
		a2.setDoenca(dn2);
		a2.setDono(d2);
		a2.comer();
		
		/*--------Veterinario--------*/
		Veterinario v1 = new Veterinario();
		Veterinario v2 = new Veterinario();
		
		v1.setNome("Mauro");
		v1.setIdade(43);
		v1.setSexo("Masculino");
		v1.setId(14534);
		v1.setTurno("Diurno");
		v1.trabalhar();
		
		v2.setNome("Mirian");
		v2.setIdade(23);
		v2.setSexo("Feminino");
		v2.setId(18534);
		v2.setTurno("Noturno");
		v2.trabalhar();
	}
}

package Observer;

public class Principal {
	
	public static void main(String[] args) {
		
		SuperInteressante r1 = new SuperInteressante();
		Leitor l1 = new Leitor("Jorge");
		
		r1.registrar(l1);
		r1.publicarArtigo("Google faliu");;
		
	}

}

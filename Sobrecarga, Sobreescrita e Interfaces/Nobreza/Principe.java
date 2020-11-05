package Nobreza;

public class Principe extends Nobre 
						implements Cavaleiro{

	public Principe() {
		super();
	}

	@Override
	public void duelar() {
		System.out.println("Principe duelando");
	}

	
}

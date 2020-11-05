package Dinossauro;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Dinossauro skeep = new Dinossauro();
		
		Scanner scan = new Scanner(System.in);
		String textoMaiusculo = "";
		char opc = ' ';
		
		while(true) {
			System.out.println("Digite uma opção: \n"
				     + "Pular | Correr | Alimentar | Brincar | Tomar Sol | Ficar na Sombra | Dormir");
			textoMaiusculo = scan.nextLine().toUpperCase();
			opc = textoMaiusculo.charAt(0);
			switch (opc){
				case 'P':
					skeep.pular();
					break;
				
				case 'C':
					skeep.correr();
					break;
				
				case 'A':
					skeep.comer();
					break;
				
				case 'B':
					skeep.brincar();
					break;
				
				case 'T':
					skeep.tomarSol();
					break;
				
				case 'F':
					skeep.ficarNaSombra();
					break;
				
				case 'D':
					System.out.println("zZzZZzZzZZzz");
					System.exit(0);
			}
		}
	}

}

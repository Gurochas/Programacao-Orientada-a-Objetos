
package Aluno;

import javax.swing.JOptionPane;

public class GestaoAlunos {
	
	private int indice;
	private Aluno[] alunos;
	
	public GestaoAlunos() {
		super();
		alunos = new Aluno[50];
		this.indice = 0;
	}
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}


	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}//--------------------------------------------------


	public void criar() {
		alunos[indice] = new Aluno();
		alunos[indice].setId(Long.parseLong(JOptionPane.showInputDialog("Digite o ID do aluno")));
		alunos[indice].setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		alunos[indice].setRa(JOptionPane.showInputDialog("Digite o RA do aluno"));
		alunos[indice].setNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno"));
		indice++;
	}
	
	public void atualizar() {
		String ra = JOptionPane.showInputDialog("Digite o RA do aluno a ser atualizado");
		for(Aluno a : alunos) {
			if(a.getRa().equals(ra)) {
				a.exibir();
				a.setNome(JOptionPane.showInputDialog("Digite o novo nome do aluno"));
				a.setNascimento(JOptionPane.showInputDialog("Digite a nova data de nascimento do nome do aluno"));
				System.out.println("Aluno atualizado com sucesso");
				break;
			}
		}
	}
	
	public void exibir() {
		String ra = JOptionPane.showInputDialog("Digite o RA do aluno a ser procurado");
		for(Aluno a : alunos) {
			if(a.getRa().equals(ra)) 
				a.exibir();
			System.out.println("---------------------------------");
		}
	}
	
	public void excluir() {
		String ra = JOptionPane.showInputDialog("Digite o RA do aluno a ser excluido");
		for(int i = 0; i < 50; i++) {
			if(alunos[i].getRa().equals(ra)) 
				alunos[i] = null;
			System.out.println("Aluno excluido com sucesso");
		}
	}
	
	public void menu() {
		while(true) {
			char opc = JOptionPane.showInputDialog("Digite uma opção: \n \n - Criar \n - Exibir \n - Remover \n - Atualizar \n - Sair").toUpperCase().charAt(0);
			switch(opc) {
			
				case 'C': 
					criar();
					break;
					
				case 'E':
					exibir();
					break;
					
				case 'R':
					excluir();
					break;
					
				case 'A': 
					atualizar();
					break;
					
				case 'S':
					JOptionPane.showMessageDialog(null, "ENCERRANDO");
					System.exit(0);
			}
		}
	}
	
}
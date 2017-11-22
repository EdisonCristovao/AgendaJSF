package teste;

import bean.ContatoMB;
import model.Contato;

public class ContatoTESTE {
	public static void main(String[] args) {
		ContatoMB c = new ContatoMB();
		c.getContato().setNome("Naiady");
		c.salvar();
		
		
		for (Contato co : c.mostra()) {
			System.out.println(co.getNome());
		}
	}

}

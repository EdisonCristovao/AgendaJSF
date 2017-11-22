package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import dao.ContatoDAO;
import model.Contato;

@ManagedBean(name = "contatoMB")
@RequestScoped
@ViewScoped
public class ContatoMB {
	ContatoDAO dao = new ContatoDAO();
	Contato contato = new Contato();

	public String salvar() {
		dao.salvar(contato);
		return "/listaContato.xhtml?faces-redirect=true";
	}

	public ContatoDAO getDao() {
		return dao;
	}

	public void setDao(ContatoDAO dao) {
		this.dao = dao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> mostra() {
		return (List<Contato>) dao.lista();
	}

}

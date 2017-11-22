package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Contato;

public class ContatoDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public ContatoDAO() {
		emf = Persistence.createEntityManagerFactory("AgendaWeb");
		em = emf.createEntityManager();
	}

	public Contato salvar(Contato contato) {
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		return contato;
	}
	@SuppressWarnings("unchecked")
	public List<Contato> lista() {
		Query query = em.createQuery("SELECT c FROM Contato c");
		return query.getResultList();
	}
}

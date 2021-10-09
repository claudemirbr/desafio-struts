package br.com.atomicweb.repository;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.atomicweb.model.Contato;

public class Contatos {
	
	public List<Contato> getContatos() throws ClassNotFoundException {
		EntityManager em = CriaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		return em.createQuery("select c from Contato c", Contato.class).getResultList();
	}

	public Contato getContato(Contato contato) {
		EntityManager em = CriaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		return (Contato) em.createQuery("select c from Contato c where id = :id")
			.setParameter("id", contato.getId())
			.getSingleResult();
	}

	public void salvaContato(Contato contato) {
		EntityManager em = CriaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
	}

	public void editaContato(Contato contato) {
		EntityManager em = CriaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(contato);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}

	public void deletaContato(Contato contato) {
		EntityManager em = CriaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(em.contains(contato) ? contato : em.merge(contato));
		em.getTransaction().commit();
		em.close();
	}	

}

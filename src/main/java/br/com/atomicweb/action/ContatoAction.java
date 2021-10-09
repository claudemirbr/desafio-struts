package br.com.atomicweb.action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.atomicweb.model.Contato;
import br.com.atomicweb.repository.Contatos;

public class ContatoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8205834090635913361L;
	private String id;
	private Contato c;
	private Contatos cs;
	private List<Contato> lista;
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		cs = new Contatos();
		lista = cs.getContatos();		
		return SUCCESS;
	}

	public String novo() {
		c = new Contato();
		return SUCCESS;
	}
	
	public String editar() {
		c = new Contato();
		c.setId(Long.valueOf(this.id));
		cs = new Contatos();
		c = cs.getContato(c);
		return SUCCESS;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Contato> getLista() {
		return lista;
	}

	public void setLista(List<Contato> lista) {
		this.lista = lista;
	}

	public Contato getC() {
		return c;
	}

	public void setC(Contato c) {
		this.c = c;
	}

}

package br.com.atomicweb.service;

import java.util.List;

import br.com.atomicweb.model.Contato;

public interface ContatoService {

	List<Contato> listaContatos();

	Contato getContato(Contato contato);

	void salvaContato(Contato contato);

	void editaContato(Contato contato);

	void deletaContato(Contato contato);

}

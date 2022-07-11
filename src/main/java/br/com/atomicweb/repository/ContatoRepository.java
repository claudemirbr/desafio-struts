package br.com.atomicweb.repository;

import java.util.List;

import br.com.atomicweb.model.Contato;

public interface ContatoRepository {

	List<Contato> listaContato();

	Contato getContato(Contato contato);

	void salvaContato(Contato contato);

	void editaContato(Contato contato);

	void deletaContato(Contato contato);

}

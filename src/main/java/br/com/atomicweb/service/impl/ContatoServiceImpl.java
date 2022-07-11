package br.com.atomicweb.service.impl;

import java.util.List;

import br.com.atomicweb.model.Contato;
import br.com.atomicweb.repository.ContatoRepository;
import br.com.atomicweb.repository.impl.ContatoRepositoryImpl;
import br.com.atomicweb.service.ContatoService;

public class ContatoServiceImpl implements ContatoService {

	private ContatoRepository contatoRepository;

	@Override
	public List<Contato> listaContatos() {
		contatoRepository = new ContatoRepositoryImpl();
		return contatoRepository.listaContato();
	}

	@Override
	public Contato getContato(Contato contato) {
		contatoRepository = new ContatoRepositoryImpl();
		return contatoRepository.getContato(contato);
	}

	@Override
	public void salvaContato(Contato contato) {
		contatoRepository = new ContatoRepositoryImpl();
		contatoRepository.salvaContato(contato);
	}

	@Override
	public void editaContato(Contato contato) {
		contatoRepository = new ContatoRepositoryImpl();
		contatoRepository.editaContato(contato);
	}

	@Override
	public void deletaContato(Contato contato) {
		contatoRepository = new ContatoRepositoryImpl();
		contatoRepository.deletaContato(contato);
	}
}

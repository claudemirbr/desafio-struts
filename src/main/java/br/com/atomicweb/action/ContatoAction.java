package br.com.atomicweb.action;

import java.util.List;

import br.com.atomicweb.model.Contato;
import br.com.atomicweb.service.ContatoService;
import br.com.atomicweb.service.impl.ContatoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

@Data
public class ContatoAction extends ActionSupport {

	private static final long serialVersionUID = -8205834090635913361L;

	private Integer id;
	private String nome;
	private String email;
	private Contato contato;
	private List<Contato> contatos;

	private ContatoService contatoService;

	public ContatoAction () {
		contatoService = new ContatoServiceImpl();
	}

	@Override
	public String execute() throws Exception {
		contatos = contatoService.listaContatos();
		return SUCCESS;
	}

	public String novo() {
		return SUCCESS;
	}

	public String salva() {
		contato = new Contato();
		contato.setNome(this.nome);
		contato.setEmail(this.email);
		if (contato.getId() == null) {
			contatoService.salvaContato(contato);
		} else {
			contatoService.editaContato(contato);
		}
		contatos = contatoService.listaContatos();
		return SUCCESS;
	}
	
	public String editar() {
		contato = new Contato();
		contato.setId(this.id);
		contato = contatoService.getContato(contato);
		this.nome = contato.getNome();
		this.email = contato.getEmail();
		return SUCCESS;
	}

	public String excluir() {
		contato = new Contato();
		contato.setId(this.id);
		contatoService.deletaContato(contato);
		contatos = contatoService.listaContatos();
		return SUCCESS;
	}

}

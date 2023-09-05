package br.com.messias.loja.orcamento;

import java.util.Map;

import br.com.messias.loja.expections.DomainException;
import br.com.messias.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	
	
	public RegistroDeOrcamento(HttpAdapter http) {
		super();
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQtdItens()
				);
		
		http.post(url, dados);
	}

}

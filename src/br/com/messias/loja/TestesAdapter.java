package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.http.JavaHttpClient;
import br.com.messias.loja.orcamento.ItemOrcamento;
import br.com.messias.loja.orcamento.Orcamento;
import br.com.messias.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String...args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.addItemOrcamento(new ItemOrcamento(BigDecimal.TEN));
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		registroDeOrcamento.registrar(orcamento);
		
	}
}

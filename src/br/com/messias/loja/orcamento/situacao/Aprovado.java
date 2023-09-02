package br.com.messias.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {
	
	
	public BigDecimal calcularValorDescontoEXtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}

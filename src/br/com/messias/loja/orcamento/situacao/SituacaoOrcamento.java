package br.com.messias.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.messias.loja.expections.DomainException;
import br.com.messias.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoEXtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("O orcamento não pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("O orcamento não pode ser reprovado");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("O orcamento não pode ser finalizado");
	}

}

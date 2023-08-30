package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ParaOrcamentoComMaisDeCincoItens extends Desconto{

	public ParaOrcamentoComMaisDeCincoItens(Desconto desconto) {
		super(desconto);
		
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean devoAplicar(Orcamento orcamento) {
		return orcamento.getQtdItens() > 5;
	}

}

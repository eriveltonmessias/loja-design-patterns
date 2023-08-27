package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ParaOrcamentoComMaisDeCincoItens extends Desconto{

	public ParaOrcamentoComMaisDeCincoItens(Desconto desconto) {
		super(desconto);
		
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQtdItens() > 5) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	}

}

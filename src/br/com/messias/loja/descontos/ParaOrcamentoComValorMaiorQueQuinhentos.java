package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{

	public ParaOrcamentoComValorMaiorQueQuinhentos(Desconto desconto) {
		super(desconto);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500"))> 0) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}

}

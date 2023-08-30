package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ParaOrcamentoComValorMaiorQueQuinhentos extends Desconto{

	public ParaOrcamentoComValorMaiorQueQuinhentos(Desconto desconto) {
		super(desconto);
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean devoAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500"))> 0;
	}

}

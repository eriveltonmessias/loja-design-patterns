package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}

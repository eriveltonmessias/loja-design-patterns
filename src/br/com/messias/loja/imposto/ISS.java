package br.com.messias.loja.imposto;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ISS implements Imposto{

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}

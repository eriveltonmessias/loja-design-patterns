package br.com.messias.loja.imposto;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outro) {
		super(outro);
	}

	@Override
	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}

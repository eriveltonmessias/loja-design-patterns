package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		if(orcamento.getQtdItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		if(orcamento.getValor().compareTo(new BigDecimal("500"))> 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return BigDecimal.ZERO;
	}
}

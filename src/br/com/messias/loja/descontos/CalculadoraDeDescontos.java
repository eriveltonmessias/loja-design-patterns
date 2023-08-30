package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new ParaOrcamentoComMaisDeCincoItens(
				new ParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}	
}

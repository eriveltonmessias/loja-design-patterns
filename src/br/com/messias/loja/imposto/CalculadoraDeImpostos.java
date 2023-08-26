package br.com.messias.loja.imposto;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}

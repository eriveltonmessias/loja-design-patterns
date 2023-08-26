package br.com.messias.loja.imposto;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular(Orcamento orcamento);

}

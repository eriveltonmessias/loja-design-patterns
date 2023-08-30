package br.com.messias.loja.descontos;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto desconto) {
		this.proximo = desconto;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		return devoAplicar(orcamento) ?
				efetuarCalculo(orcamento) : proximo.calcular(orcamento);
		
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean devoAplicar(Orcamento orcamento);

}

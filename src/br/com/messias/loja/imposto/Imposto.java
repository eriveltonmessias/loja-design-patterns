package br.com.messias.loja.imposto;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto outro;
	
	public Imposto(Imposto outro) {
		super();
		this.outro = outro;
	}

	protected abstract  BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto =  realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if(outro != null) {
			valorOutroImposto = outro.calcular(orcamento); 
		}
		
		return valorImposto.add(valorOutroImposto);
	}

}

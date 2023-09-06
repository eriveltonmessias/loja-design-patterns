package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.orcamento.ItemOrcamento;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteComposicao {

	public static void main(String[] args) {
		
		Orcamento antigo = new Orcamento();
		antigo.addItemOrcamento(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.addItemOrcamento(new ItemOrcamento(new BigDecimal("300")));
		novo.addItemOrcamento(antigo);
		novo.aprovar();
		
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		System.out.println(novo.getValor());
		
		
		

	}

}

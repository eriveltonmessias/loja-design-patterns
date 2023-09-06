package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.imposto.CalculadoraDeImpostos;
import br.com.messias.loja.imposto.ICMS;
import br.com.messias.loja.imposto.ISS;
import br.com.messias.loja.orcamento.ItemOrcamento;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.addItemOrcamento(new ItemOrcamento(new BigDecimal("100")));
		 	
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		
		System.out.println(calculadoraDeImpostos.calcular(orcamento,new ICMS(null)));
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))));
	


	}

}

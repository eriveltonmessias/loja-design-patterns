package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.descontos.CalculadoraDeDescontos;
import br.com.messias.loja.orcamento.Orcamento;
import br.com.messias.loja.orcamento.ItemOrcamento;

public class TesteDesconto {

	public static void main(String[] args) {

		
	Orcamento primeiro = new Orcamento();
	primeiro.addItemOrcamento(new ItemOrcamento(new BigDecimal("501")));
	Orcamento segundo = new Orcamento();
	segundo.addItemOrcamento(new ItemOrcamento(new BigDecimal("600")));
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(primeiro));
		System.out.println(calculadoraDeDescontos.calcular(segundo));
		 	

	}

}

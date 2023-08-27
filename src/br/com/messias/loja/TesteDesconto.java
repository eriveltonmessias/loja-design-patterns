package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.descontos.CalculadoraDeDescontos;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {

		
	Orcamento primeiro = new Orcamento(new BigDecimal("501"),1);
	Orcamento segundo = new Orcamento(new BigDecimal("600"),6);
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(primeiro));
		System.out.println(calculadoraDeDescontos.calcular(segundo));
		 	

	}

}

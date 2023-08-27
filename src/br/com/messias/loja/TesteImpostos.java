package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.descontos.CalculadoraDeDescontos;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("501"),1);
		
		CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
		
		System.out.println(calculadoraDeDescontos.calcular(orcamento));
		 	


	}

}

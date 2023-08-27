package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.imposto.CalculadoraDeImpostos;
import br.com.messias.loja.imposto.ICMS;
import br.com.messias.loja.imposto.ISS;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
		 	
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		
		System.out.println(calculadoraDeImpostos.calcular(orcamento,new ICMS()));
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));

	}

}

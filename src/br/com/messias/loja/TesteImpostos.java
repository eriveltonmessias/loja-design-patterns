package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.imposto.CalculadoraDeImpostos;
import br.com.messias.loja.imposto.TipoImposto;
import br.com.messias.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		 
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		
		System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
		System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));

	}

}

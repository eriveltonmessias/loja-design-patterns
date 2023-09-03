package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.pedido.GerarPedido;

public class TestePedido {

	public static void main(String...arg) {
		
		String cliente = "Erivelton";
		
		
		GerarPedido gerarPedido = new GerarPedido(cliente,new BigDecimal("100") , 5);
		gerarPedido.executa();
		
	}
}

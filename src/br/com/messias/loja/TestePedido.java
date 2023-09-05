package br.com.messias.loja;

import java.math.BigDecimal;

import br.com.messias.loja.pedido.GeraPedidoHandler;
import br.com.messias.loja.pedido.GerarPedido;

public class TestePedido {

	public static void main(String...arg) {
		
		String cliente = "Erivelton";
		
		
		GerarPedido gerarPedido = new GerarPedido(cliente,new BigDecimal("100") , 5);
		
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(/*dependencias*/);
		geraPedidoHandler.execute(gerarPedido);
		
	}
}

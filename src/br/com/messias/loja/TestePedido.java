package br.com.messias.loja;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.messias.loja.pedido.GeraPedidoHandler;
import br.com.messias.loja.pedido.GerarPedido;
import br.com.messias.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.messias.loja.pedido.acao.EnviarEmailPedido;
import br.com.messias.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestePedido {

	public static void main(String...arg) {
		
		String cliente = "Erivelton";
		
		
		GerarPedido gerarPedido = new GerarPedido(cliente,new BigDecimal("100") , 5);
		
		List<AcaoAposGerarPedido> acoes = Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados());
		
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(acoes);
		geraPedidoHandler.execute(gerarPedido);
		
	}
}

package br.com.messias.loja.pedido.acao;

import br.com.messias.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{
	
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedido no BD");
	}

}

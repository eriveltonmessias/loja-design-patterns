package br.com.messias.loja.pedido.acao;

import br.com.messias.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
	
	public void executar(Pedido pedido) {
		System.out.println("Enviar email com dados do pedido");
	}

}

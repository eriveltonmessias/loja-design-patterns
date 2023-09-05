package br.com.messias.loja.pedido;

import java.time.LocalDateTime;

import br.com.messias.loja.orcamento.Orcamento;

public class GeraPedidoHandler /*implements commandsInterface*/{
	
	// constructor com injecao de dependencia: pedidoRepository, emailService...
	
	public void execute(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido na base");
		System.out.println("Enviar email com dados do novo pedido");
	}

}

package br.com.messias.loja.pedido;

import java.time.LocalDateTime;

import br.com.messias.loja.orcamento.Orcamento;
import br.com.messias.loja.pedido.acao.EnviarEmailPedido;
import br.com.messias.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandler /*implements commandsInterface*/{
	
	// constructor com injecao de dependencia: pedidoRepository, emailService...
	
	public void execute(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		EnviarEmailPedido emailPedido = new EnviarEmailPedido();
		emailPedido.executar(pedido);
		SalvarPedidoNoBancoDeDados bancoDeDados = new SalvarPedidoNoBancoDeDados();
		bancoDeDados.executar(pedido);

	}

}

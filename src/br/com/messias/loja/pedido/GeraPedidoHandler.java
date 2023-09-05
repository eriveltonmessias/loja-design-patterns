package br.com.messias.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.messias.loja.orcamento.Orcamento;
import br.com.messias.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler /*implements commandsInterface*/{
	

	private List<AcaoAposGerarPedido> acoes;
	
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}

	public void execute(GerarPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

			this.acoes.forEach(a -> a.executar(pedido));
	}

}

package br.com.messias.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.messias.loja.orcamento.Orcamento;

public class GerarPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int qtdItens;
	
	
	public GerarPedido(String cliente, BigDecimal valorOrcamento, int qtdItens) {
		super();
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.qtdItens = qtdItens;
	}
	
	
	public void executa() {
		Orcamento orcamento = new Orcamento(valorOrcamento, qtdItens);
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido na base");
		System.out.println("Enviar email com dados do novo pedido");
	}
	

	
	

}

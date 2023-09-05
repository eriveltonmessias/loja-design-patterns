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
	


	public String getCliente() {
		return cliente;
	}


	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}


	public int getQtdItens() {
		return qtdItens;
	}
	
}

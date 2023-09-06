 package br.com.messias.loja.orcamento;

import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.messias.loja.orcamento.situacao.EmAnalise;
import br.com.messias.loja.orcamento.situacao.Finalizado;
import br.com.messias.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private List<ItemOrcamento> itens;
	private SituacaoOrcamento situacao;
	

	public Orcamento() {
		super();
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}
	
	
	public void aplicarDescontoExtra() {
		
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoEXtra(this);		
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
		
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public void addItemOrcamento(ItemOrcamento ItemOrcamento) {
		this.valor = this.valor.add(ItemOrcamento.getValor());
		this.itens.add(ItemOrcamento);
	}


	public List<ItemOrcamento> getItens() {
		return itens;
	}


	public SituacaoOrcamento getSituacao() {
		return situacao;
	}


	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}


	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}


	public int getQtdItens() {
		return this.itens.size();
	}
	
	
	
}

package br.com.messias.loja.orcamento.situacao;

import br.com.messias.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}

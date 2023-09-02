package br.com.messias.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.messias.loja.orcamento.Orcamento;
import br.com.messias.loja.pedido.Pedido;

public class TestePedido {

	public static void main(String...arg) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 3);
		String cliente = "Erivelton";
		LocalDateTime data = LocalDateTime.now();
		
		
		Pedido pedido = new Pedido(cliente, data, orcamento);
		
		System.out.println("Salvar pedido na base");
		System.out.println("Enviar email com dados do novo pedido");
		
	}
}

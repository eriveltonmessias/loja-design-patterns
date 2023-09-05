package br.com.messias.loja.http;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {

		try {
			new URL(url).openConnection().connect();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao enviar requisicao HTTP",e);
		}
	}

}

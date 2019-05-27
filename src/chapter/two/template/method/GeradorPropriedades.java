package chapter.two.template.method;

import java.io.IOException;
import java.util.Map;

public class GeradorPropriedades extends GeradorArquivo {

	private PosProcessador processador;

	public GeradorPropriedades(PosProcessador processador) {
		this.processador = processador;
	}

	protected byte[] processar(byte[] bytes) throws IOException {
		return processador.processar(bytes);
	}

	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		
		for (String prop : props.keySet()) {
			propFileBuilder.append(prop + "=" + props.get(prop) + "\n");
		}
		
		return propFileBuilder.toString();
	}
}

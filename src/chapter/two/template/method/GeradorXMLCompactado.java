package chapter.two.template.method;

import java.io.IOException;
import java.util.Map;

public class GeradorXMLCompactado extends GeradorArquivo {
	
	private PosProcessador processador;

	public GeradorXMLCompactado(PosProcessador processador) {
		this.processador = processador;
	}

	protected byte[] processar(byte[] bytes) throws IOException {
		return processador.processar(bytes);	
	}

	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		
		for (String prop : props.keySet()) {
			propFileBuilder.append("<" + prop + ">" + props.get(prop) + "</" + prop + ">");
		}
		
		propFileBuilder.append("</properties>");
		return propFileBuilder.toString();
	}
}

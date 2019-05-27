package chapter.two.template.method;

import java.io.IOException;

public interface PosProcessador {

	byte[] processar(byte[] bytes) throws IOException;
}

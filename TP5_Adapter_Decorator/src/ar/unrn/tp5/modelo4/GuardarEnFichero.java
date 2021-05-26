package ar.unrn.tp5.modelo4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarEnFichero implements ConsumidorWeb {

	private ConsumidorWeb consumidor;
	private String patch;

	public GuardarEnFichero(ConsumidorWeb consumidor, String patch) {
		this.consumidor = consumidor;
		this.patch = patch;
	}

	@Override
	public String run() {
		String listaPosts = this.consumidor.run();
		try {
			Files.write(Paths.get(this.patch), listaPosts.getBytes());
		} catch (IOException e) {
			throw new RuntimeException("No se pudo persistir en fichero", e);
		}
		return listaPosts;

	}

}

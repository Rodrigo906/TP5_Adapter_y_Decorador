package ar.unrn.tp5.modelo2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Report implements Reporte {

	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public boolean export(File file) {
		boolean reportExitoso = false;
		// Exportar el reporte a un archivo.
		try {
			Files.write(Paths.get(file.getPath()), reporte.getBytes());
			reportExitoso = true;
		} catch (IOException e) {
			throw new RuntimeException("No se pudo exportar", e);
		}
		return reportExitoso;
	}

}

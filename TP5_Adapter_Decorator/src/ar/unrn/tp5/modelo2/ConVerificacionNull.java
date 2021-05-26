package ar.unrn.tp5.modelo2;

import java.io.File;

public class ConVerificacionNull implements Reporte {

	private Reporte reporte;

	public ConVerificacionNull(Reporte reporte) {
		this.reporte = reporte;
	}

	@Override
	public boolean export(File file) {
		boolean exito = false;
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		this.reporte.export(file);
		exito = true;
		return exito;

	}

}

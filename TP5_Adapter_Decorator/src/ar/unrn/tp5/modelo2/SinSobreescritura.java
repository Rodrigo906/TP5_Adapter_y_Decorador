package ar.unrn.tp5.modelo2;

import java.io.File;

public class SinSobreescritura implements Reporte {

	private Reporte reporte;

	public SinSobreescritura(Reporte reporte) {
		this.reporte = reporte;
	}

	@Override
	public boolean export(File file) {
		boolean exito = false;
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		this.reporte.export(file);
		exito = true;
		return exito;
	}

}

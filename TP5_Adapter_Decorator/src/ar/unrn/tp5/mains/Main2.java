package ar.unrn.tp5.mains;

import java.io.File;

import ar.unrn.tp5.modelo2.ConVerificacionNull;
import ar.unrn.tp5.modelo2.Report;
import ar.unrn.tp5.modelo2.Reporte;
import ar.unrn.tp5.modelo2.SinSobreescritura;

public class Main2 {

	public static void main(String[] args) {
		int opcion = 2;
		File file = new File("C:/Users/Rodrigo/reporte.txt");
		Reporte reporte;

		try {
			switch (opcion) {
			case 0:
				reporte = new Report("reporte comun");
				reporte.export(file);
				break;

			case 1:
				file = null;
				reporte = new ConVerificacionNull(new Report("reporte con verificacion null"));
				reporte.export(file);
				break;

			case 2:
				reporte = new SinSobreescritura(new Report("reporte sin sobreescritura"));
				reporte.export(file);
				break;
			case 3:
				file = null;
				reporte = new ConVerificacionNull(
						new SinSobreescritura(new Report("reporte con verificacion null y sin sobreescritura")));
				reporte.export(file);
				break;
			case 4:
				if (file.delete())
					;
				System.out.println("Eliminado exitosamente");
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

package ar.unrn.tp5.tests;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import ar.unrn.tp5.modelo2.ConVerificacionNull;
import ar.unrn.tp5.modelo2.Report;
import ar.unrn.tp5.modelo2.Reporte;
import ar.unrn.tp5.modelo2.SinSobreescritura;

public class TestModelo2 {

	@Test
	public void exportacionExitosa() {
		File file = new File("C:/Users/Rodrigo/reportePrueba.txt");
		Reporte report = new Report("reporte");
		boolean estadoOperacion = report.export(file);
		file.delete();
		Assert.assertTrue(estadoOperacion);
	}

	@Test(expected = IllegalArgumentException.class)
	public void exportacionConSobreescritura() {
		File file = new File("C:/Users/Rodrigo/reportePrueba.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error de creacion de fichero");
		}
		Reporte report = new SinSobreescritura(new Report("reporte"));
		report.export(file);
		file.delete();
	}

	@Test(expected = IllegalArgumentException.class)
	public void exportarConVerificacionNull() {
		File file = null;
		Reporte report = new ConVerificacionNull(new Report("reporte"));
		report.export(file);
	}

}

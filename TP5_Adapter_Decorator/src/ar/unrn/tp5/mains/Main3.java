package ar.unrn.tp5.mains;

import ar.unrn.tp5.modelo3.Combo;
import ar.unrn.tp5.modelo3.ComboGenerico;
import ar.unrn.tp5.modelo3.PorcionAdicional;

public class Main3 {

	public static void main(String[] args) {

		// Adicional: tomate y queso
		Combo combo1 = new PorcionAdicional(
				new PorcionAdicional(new ComboGenerico("alburguesa, gaseosa", 300), 30, "Tomate"), 25, "queso");
		System.out.println("Combo 1: " + combo1.getDescripcion() + " /Precio: " + combo1.getPrecio());

		// Adicional: papa y carne
		Combo combo2 = new PorcionAdicional(
				new PorcionAdicional(new ComboGenerico("alburguesa, gaseosa, salsa", 400), 40, "papa"), 50, "carne");
		System.out.println("Combo 2: " + combo2.getDescripcion() + " /Precio: " + combo2.getPrecio());

	}
}

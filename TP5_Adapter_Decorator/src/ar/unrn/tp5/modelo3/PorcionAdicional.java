package ar.unrn.tp5.modelo3;

public class PorcionAdicional implements Combo {

	protected Combo combo;
	private double precioPorcionAdicional;
	private String porcionAgregada;

	public PorcionAdicional(Combo combo, double precio, String porcionAgregada) {
		this.combo = combo;
		this.precioPorcionAdicional = precio;
		this.porcionAgregada = porcionAgregada;
	}

	@Override
	public String getDescripcion() {
		return this.combo.getDescripcion() + "," + this.obtenerPorcionAgregada();
	}

	@Override
	public double getPrecio() {
		return this.combo.getPrecio() + this.obtenerPrecioPorcion();
	}

	public String obtenerPorcionAgregada() {
		return this.porcionAgregada;
	}

	public double obtenerPrecioPorcion() {
		return this.precioPorcionAdicional;
	}

}

package ar.unrn.tp5.modelo3;

public class ComboGenerico implements Combo {

	private String descripcion;
	private double precio;

	public ComboGenerico(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

}

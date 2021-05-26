package ar.unrn.tp5.modelo1;

public class Electrico extends Motor {

	private MotorElectrico motorElectrico; // seria mejor crear una interface

	public Electrico(MotorElectrico motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public void arrancar() {
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

}

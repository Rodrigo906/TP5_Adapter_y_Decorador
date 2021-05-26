package ar.unrn.tp5.mains;

import ar.unrn.tp5.modelo1.Electrico;
import ar.unrn.tp5.modelo1.Motor;
import ar.unrn.tp5.modelo1.MotorElectrico;

public class Main1 {

	public static void main(String[] args) {

		Motor motor = new Electrico(new MotorElectrico());
		motor.arrancar();
	}
}

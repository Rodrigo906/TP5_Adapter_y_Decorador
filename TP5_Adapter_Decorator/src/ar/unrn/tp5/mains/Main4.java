package ar.unrn.tp5.mains;

import ar.unrn.tp5.modelo4.ConsumidorWeb;
import ar.unrn.tp5.modelo4.GuardarEnBD;
import ar.unrn.tp5.modelo4.RestCall;

public class Main4 {

	public static void main(String[] args) {

		ConsumidorWeb consumidor = new GuardarEnBD(new RestCall("https://jsonplaceholder.typicode.com/posts"));
		consumidor.run();

	}

}

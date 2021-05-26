package ar.unrn.tp5.modelo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarEnBD implements ConsumidorWeb {

	private ConsumidorWeb consumidor;
	private Connection dbConn;

	public GuardarEnBD(ConsumidorWeb consumidor) {
		this.consumidor = consumidor;
	}

	@Override
	public String run() {
		setupBaseDeDatos();
		String listaPosts = this.consumidor.run();
		PreparedStatement st = null;
		String[] parts = listaPosts.split("},");
		String post = null;
		try {
			for (int i = 0; i < parts.length; i++) {
				post = parts[i].replace("{", "");
				st = dbConn.prepareStatement("INSERT INTO post(post) VALUES (?)");
				st.setString(1, post);
				st.executeUpdate();
			}
			st.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error al persistir", e);
		}

		return null;
	}

	private void setupBaseDeDatos() {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "";
		try {
			this.dbConn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("Error al persistir", e);
		}

	}

}

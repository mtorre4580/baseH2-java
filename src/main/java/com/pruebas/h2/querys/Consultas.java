package com.pruebas.h2.querys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pruebas.h2.clases.Usuario;

public class Consultas {
	
	private DataSource datasource;

	private static final Logger logger = LoggerFactory
			.getLogger(Consultas.class);
	
	private final String QUERY_INSERTAR_USUARIO = "insert into USUARIO(nombre,edad) values(?,?)";
	
	/**
	 * Permite iniciar la conexión a la base de datos H2 de Recibos.
	 */
	public Connection obtenerConexionH2Recibo() throws SQLException {
		return getDatasource().getConnection();
	}
	
	
	public void agregarUsuario(Usuario user) throws SQLException {
		Connection connection = obtenerConexionH2Recibo();
		PreparedStatement ps = connection
				.prepareStatement(QUERY_INSERTAR_USUARIO);
		ps.setString(1, user.getNombre());
		ps.setInt(2, user.getEdad());
		ps.executeUpdate();
		logger.info("Se agrego al usuario...");
		ps.close();
		connection.close();
	}
	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
}

package com.pruebas.h2.principal;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.pruebas.h2.clases.Usuario;
import com.pruebas.h2.querys.Consultas;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/application-context.xml" })
public class Principal {
	
	@Autowired
	Consultas consultas;
	@Autowired
	Usuario user;
	
	@Test
	public void agregarUsuarioTest() throws SQLException {
		
		user.setNombre("Matias");
		user.setEdad(21);
		consultas.agregarUsuario(user);
	}

	
	
	
}

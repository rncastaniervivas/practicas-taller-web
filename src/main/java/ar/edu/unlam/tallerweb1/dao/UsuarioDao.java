package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario consultarUsuario (Usuario usuario);
}
/*puede tener un buscar todos, lo relacionado al usuario
 * 
 * un archivo dao no puede contener otro dao*/
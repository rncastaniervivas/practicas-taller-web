package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Usuario consultarUsuario(Usuario usuario) {

		final Session session = sessionFactory.openSession();
		return (Usuario) session.createCriteria(Usuario.class) 
				/*el parentesis de criteria devuelve el tipo de ese dato en este caso de tipo Usuario*/
				.add(Restrictions.eq("email", usuario.getEmail()))
				.add(Restrictions.eq("password", usuario.getPassword()))
				.uniqueResult();
				
				/*el ComunaBuscada es el alias a generar independientemente del nombre en la tabla*/
				/*.createAlias("Barrio.comuna", "ComunaBuscada");	
				.add (Restriction.eq("ComunaBuscada.nombre","Comuna 10");
				list();
				agregamos un alias para buscar todas los barrios que pertenecen a la comuna 10
				No ponemos .uniqueResult(); para que NO devuelva un solo resultado*/
	}

}

package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Cbu;
import ar.edu.unlam.tallerweb1.modelo.Cliente;

@Service("ClienteDao")
public class ClienteDaoImpl implements ClienteDao{
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(cliente);
	}
	
	@Override
	public void buscarCbu (Cbu cbuPrueba){
		final Session session = sessionFactory.getCurrentSession();
		session.save(cbuPrueba);
	}
}

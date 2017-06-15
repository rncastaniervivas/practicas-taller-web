package ar.edu.unlam.tallerweb1;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ClienteDao;
import ar.edu.unlam.tallerweb1.modelo.Cbu;
import ar.edu.unlam.tallerweb1.modelo.Cliente;

public class TestCliente extends SpringTest {
	
	@Inject
	private ClienteDao ClienteDao;
	
	@Test
	@Transactional @Rollback(true)
	public void pruebaInsertarUnaPersona() {
		
		/* Preparacion */
		Cliente matias = new Cliente();
		matias.setNombre("Matias");
		
		/* Operacion */
		ClienteDao.guardarCliente(matias);
		
		/* Verifiacion */
		Cliente obtenido = sessionFactory.getCurrentSession().get(Cliente.class, matias.getId());
		Assert.assertTrue(obtenido.getNombre().equals("Matias"));
	}
	@Test
	@Transactional @Rollback (true)
	public void pruebaTraerFkCliente(){
		/* Preparacion */
		Cliente rocio = new Cliente();
		Cbu cbuPrueba = new Cbu();
		rocio.setNombre("Rocío");
		cbuPrueba.setNombreCbu("Rocio_Cbu");
		
		/* Operacion */
		ClienteDao.buscarCbu(cbuPrueba);
		
		/* Verifiacion */
		Cbu resultado = sessionFactory.getCurrentSession().get(Cbu.class, cbuPrueba.getId());
		Assert.assertTrue(resultado.getNombreCbu().equals("Rocio_Cbu"));
		
	}
	
}

package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Cbu;
import ar.edu.unlam.tallerweb1.modelo.Cliente;

public interface ClienteDao {
	void guardarCliente (Cliente cliente);
	void buscarCbu (Cbu cbuPrueba);
}

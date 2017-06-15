package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Service("servicioTabla")
@Transactional
public class ServicioTablaImp implements ServicioTabla	{
	@Override
	public Persona filtrarPersona (ArrayList listaPersona){
		ArrayList <Persona> listaAuxiliar= new ArrayList <Persona> ();
		
		for (Persona resultado:listaAuxiliar){
			if(resultado.genero.equals(opcion))
		}
	}
	
}

package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Controller
public class ControladorPersona {
/*	@RequestMapping("/hola/nombre")
	public ModelAndView saludoInicial(@RequestParam ("nombre")String nombre) {
		
		String mensaje= "Hola, " + nombre +" !";
		ModelMap model = new ModelMap();
		model.put("mensajeAMostrar", mensaje);
		
		return new ModelAndView("vistaAInvocar", model);
		
	}*/

	@RequestMapping("/hola/{nombre}")
	public ModelAndView saludoInicial(@PathVariable String nombre) {	
		String mensaje= "Hola, " + nombre +" !";
		ModelMap model = new ModelMap();
		model.put("mensajeAMostrar", mensaje);
		
		return new ModelAndView("vistaAInvocar", model);
		
	}
	
	@RequestMapping ("tabla/{opcion}")
	public ModelAndView mostrarTabla (@PathVariable String opcion){
		String opcion = opcion;
		ArrayList <Persona> listaPersona= new ArrayList <Persona> (); 
		Persona miPersona = new Persona();
		miPersona.nombre="Rocío";
		miPersona.apellido="Castañer Vivas";
		miPersona.edad= 30;
		miPersona.dni=32859267;
		miPersona.genero="F";
		listaPersona.add(miPersona);
		
		Persona miPersona2= new Persona();
		miPersona2.nombre="Ruben";
		miPersona2.apellido="Alejandro";
		miPersona2.edad= 30;
		miPersona2.dni=12345678;
		miPersona2.genero="M";
		listaPersona.add(miPersona2);
		
		ModelMap model = new ModelMap();
		model.put("listaPersona", listaPersona);
		model.put("numero", numero);
		
		return new ModelAndView("vistaAInvocar", model);
	}
	
}

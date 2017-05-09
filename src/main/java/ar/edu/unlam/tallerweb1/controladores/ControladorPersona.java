package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
}

package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Persona;

@Controller
public class ControladorTablaPersona {
	
	@RequestMapping ("/tabla")
	public ModelAndView numero (){
		Persona miPersona = new Persona("Rocio", "Castañer", 30, 32859267,"F");
		ModelMap model = new ModelMap();
		model.put("tablaAMostrar", miPersona);
		
		
		return new ModelAndView("vistaPersona", model);
	}
	
	/*generar un singletone para generar una lista 
	 * con X cantidad de persona, lo instancia con get.instance
	*/

}

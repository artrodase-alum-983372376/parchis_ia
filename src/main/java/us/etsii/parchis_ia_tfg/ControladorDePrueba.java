package us.etsii.parchis_ia_tfg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorDePrueba {

	 @GetMapping
	    public String inicio() {
	        return "Simulador de Juego de estrategia con IA."
	        		+ " El Parchís como caso de estudio";
	    }
}

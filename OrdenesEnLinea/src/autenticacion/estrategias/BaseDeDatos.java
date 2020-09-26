package autenticacion.estrategias;

import autenticacion.EstrategiaAutenticacion;
import autenticacion.estrategias.verificaciones.Cacheado;
import autenticacion.estrategias.verificaciones.DatoCrudo;
import autenticacion.estrategias.verificaciones.FuerzaBruta;

public class BaseDeDatos implements EstrategiaAutenticacion {

	@Override
	public boolean autenticar(String nombre, String contrasenia) {
		
		if(nombre.equalsIgnoreCase("Juan") && contrasenia.equalsIgnoreCase("123")) {
		
			FuerzaBruta fuerzaBruta = new FuerzaBruta();
			Cacheado cacheado = new Cacheado();
			DatoCrudo datoCrudo = new DatoCrudo();
			
			if (!fuerzaBruta.verificar(nombre, contrasenia)) {
				return false;
			}		
			
			if (!datoCrudo.verificar(nombre, contrasenia)) {
				return false;
			}
					
			if (!cacheado.verificar(nombre, contrasenia)) {
				return false;
			}			
			
			System.out.println("¡Autenticado por medio de base de datos exitosamente! ");
			
			return true;
		}
		
		return false;
	}

}

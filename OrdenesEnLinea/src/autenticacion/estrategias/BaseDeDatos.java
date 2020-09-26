package autenticacion.estrategias;

import java.util.ArrayList;

import autenticacion.EstrategiaAutenticacion;
import autenticacion.FabricaVerificacion;
import autenticacion.Verificacion;

public class BaseDeDatos implements EstrategiaAutenticacion {

	@Override
	public boolean autenticar(String nombre, String contrasenia) {
		
		if(nombre.equalsIgnoreCase("Juan") && contrasenia.equalsIgnoreCase("123")) {
		
			FabricaVerificacion fabricaVerificaciones = new FabricaVerificacion();
			ArrayList<Verificacion> verificaciones = fabricaVerificaciones.crearVerificacionesDelSistema();
			
			for (Verificacion verificacion : verificaciones) {
				if(!verificacion.verificar(nombre, contrasenia)) {
					return false;
				}
			}	
			
			System.out.println("¡Autenticado por medio de base de datos exitosamente! ");
			
			return true;
		}
		
		return false;
	}

}

package autenticacion.estrategias;

import autenticacion.EstrategiaAutenticacion;

public class Memoria implements EstrategiaAutenticacion {

	@Override
	public boolean autenticar(String nombre, String contrasenia) {
		
		return false;
	}

}

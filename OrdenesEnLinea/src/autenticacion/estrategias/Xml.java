package autenticacion.estrategias;

import autenticacion.EstrategiaAutenticacion;

public class Xml implements EstrategiaAutenticacion {

	@Override
	public boolean autenticar(String nombre, String contrasenia) {
		
		return false;
	}

}

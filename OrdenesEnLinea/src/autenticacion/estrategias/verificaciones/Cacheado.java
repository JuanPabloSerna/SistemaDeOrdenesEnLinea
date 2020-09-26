package autenticacion.estrategias.verificaciones;

import autenticacion.Verificacion;

public class Cacheado implements Verificacion {

	@Override
	public boolean verificar(String usuario, String contrasenia) {
		
		if(usuario.equalsIgnoreCase("Juan")) {
			System.out.println("Verificando si es cacheado el usuario: " + usuario);
			return true;
		}
		
		return false;
	}
}

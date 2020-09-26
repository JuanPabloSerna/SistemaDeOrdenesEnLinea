package autenticacion.estrategias.verificaciones;

import autenticacion.Verificacion;

public class FuerzaBruta implements Verificacion {

	@Override
	public boolean verificar(String usuario, String contrasenia) {
		
		if(usuario.equalsIgnoreCase("Juan")) {
			System.out.println("Verificando si es un ataque de fuerza bruta del usuario: " + usuario);
			return true;
		}
		
		return false;
	}
}

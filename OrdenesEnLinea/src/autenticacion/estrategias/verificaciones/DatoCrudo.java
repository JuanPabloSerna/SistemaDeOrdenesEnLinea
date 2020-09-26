package autenticacion.estrategias.verificaciones;

import autenticacion.Verificacion;

public class DatoCrudo implements Verificacion {

	@Override
	public boolean verificar(String usuario, String contrasenia) {
		
		if(usuario.equalsIgnoreCase("Juan")) {
			System.out.println("Saneando datos crudos del usuario: " + usuario);
			return true;
		}
		
		return false;
	}
}

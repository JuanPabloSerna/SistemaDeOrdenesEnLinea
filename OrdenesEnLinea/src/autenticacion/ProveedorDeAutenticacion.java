package autenticacion;

public class ProveedorDeAutenticacion {

	
	private EstrategiaAutenticacion autenticacion;

	
	public ProveedorDeAutenticacion(EstrategiaAutenticacion autenticacion){
      this.autenticacion = autenticacion;
	}

	public boolean ejecutar(String usuario, String contrasenia) {
		return autenticacion.autenticar(usuario, contrasenia);
	}
}

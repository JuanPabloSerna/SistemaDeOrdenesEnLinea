package autenticacion;

public interface EstrategiaAutenticacion {

	boolean autenticar(String nombre, String contrasenia);
}

package autorizacion;

import java.util.ArrayList;

public class FabricaUsuario {
	

	public ArrayList<Usuario> crearUsuariosDelSistema() {
		
		Usuario usuarioAdmin = new Usuario();
		usuarioAdmin.setNombre("Juan");
		usuarioAdmin.setContrasenia("123");
		usuarioAdmin.setRol("Admin");
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuarioAdmin);
		
		return usuarios;
	}
}

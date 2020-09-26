package autorizacion;

public class FabricaUsuario {
	

	public Usuario crearUsuariosDelSistema() {
		
		Usuario usuarioAdmin = new Usuario();
		usuarioAdmin.setNombre("Juan");
		usuarioAdmin.setContrasenia("123");
		usuarioAdmin.setRol("Admin");
		
		return usuarioAdmin;
	}
}

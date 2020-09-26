package main;

import java.util.ArrayList;

import autenticacion.ProveedorDeAutenticacion;
import autenticacion.estrategias.BaseDeDatos;
import autorizacion.FabricaUsuario;
import autorizacion.Usuario;

public class Cliente {

	public static void main(String[] args) {
		
		
		FabricaUsuario fabrica = new FabricaUsuario();
		ArrayList<Usuario> usuarios = fabrica.crearUsuariosDelSistema();
		
		ProveedorDeAutenticacion porBD = new ProveedorDeAutenticacion(new BaseDeDatos());
		
		// En caso que fuera por otro proveedor de autenticación
		//ProveedorDeAutenticacion porXml = new ProveedorDeAutenticacion(new Xml());
		//ProveedorDeAutenticacion porMemoria = new ProveedorDeAutenticacion(new Memoria());
		
		for (Usuario usuario : usuarios) {
			porBD.ejecutar(usuario.getNombre(), usuario.getContrasenia());
		}
		
		// En caso que fuera por otro proveedor de autenticación
		//porXml.ejecutar(admin.getNombre(), admin.getContrasenia());
		//porMemoria.ejecutar(admin.getNombre(), admin.getContrasenia());
	}

}

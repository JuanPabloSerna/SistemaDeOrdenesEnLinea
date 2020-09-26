package main;

import autenticacion.ProveedorDeAutenticacion;
import autenticacion.estrategias.BaseDeDatos;
import autenticacion.estrategias.Memoria;
import autenticacion.estrategias.Xml;
import autorizacion.FabricaUsuario;
import autorizacion.Usuario;

public class Cliente {

	public static void main(String[] args) {
		
		
		FabricaUsuario fabrica = new FabricaUsuario();
		Usuario admin = fabrica.crearUsuariosDelSistema();
		
		ProveedorDeAutenticacion porBD = new ProveedorDeAutenticacion(new BaseDeDatos());
		ProveedorDeAutenticacion porXml = new ProveedorDeAutenticacion(new Xml());
		ProveedorDeAutenticacion porMemoria = new ProveedorDeAutenticacion(new Memoria());
		
		porBD.ejecutar(admin.getNombre(), admin.getContrasenia());
		porXml.ejecutar(admin.getNombre(), admin.getContrasenia());
		porMemoria.ejecutar(admin.getNombre(), admin.getContrasenia());
	}

}

package autenticacion;

import java.util.ArrayList;

import autenticacion.estrategias.verificaciones.Cacheado;
import autenticacion.estrategias.verificaciones.DatoCrudo;
import autenticacion.estrategias.verificaciones.FuerzaBruta;

public class FabricaVerificacion {
	

	public ArrayList<Verificacion> crearVerificacionesDelSistema() {
		
		Verificacion cacheado = new Cacheado();
		Verificacion datoCrudo = new DatoCrudo();
		Verificacion fuerzaBruta = new FuerzaBruta();
		
		ArrayList<Verificacion> verificaciones = new ArrayList<Verificacion>();
		
		verificaciones.add(cacheado);
		verificaciones.add(datoCrudo);
		verificaciones.add(fuerzaBruta);
		
		return verificaciones;
	}
}

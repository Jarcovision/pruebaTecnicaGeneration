package proyecto2;

import proyecto1.Propietario;

public class Dirección extends Propietario {
	protected String calle;
	protected String colonia;
	protected String ciudad;
	protected int códigoPostal;
	
	public Dirección() {
		calle = "Violeta";
		colonia = "Xalpa";
		ciudad = "CDMX";
		códigoPostal = 96040;
	}

}

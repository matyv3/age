package EDIFICIOS;

import UNIDADES.TipoUnidad;
import UNIDADES.Unidad;

public class Torre extends Unidad {
	public Torre() {
		super("Torre", TipoUnidad.edificio);
		this.setAtaque(25);
		this.setDefensa(80);
		this.vida = 1800;
		this.coste_madera = 0;
		this.coste_oro = 0;
	}
}

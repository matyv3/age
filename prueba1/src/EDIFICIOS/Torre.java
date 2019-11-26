package EDIFICIOS;

import UNIDADES.Unidad;

public class Torre extends Unidad {
	public Torre() {
		super("Torre");
		this.ataque = 25;
		this.defensa = 80;
		this.vida = 1800;
		this.coste_madera = 0;
		this.coste_oro = 0;
	}
}

package EDIFICIOS;

import UNIDADES.Unidad;

public class Muralla extends Unidad {
	public Muralla() {
		super("Muralla");
		this.ataque = 0;
		this.defensa = 100;
		this.vida = 3000;
		this.coste_madera = 0;
		this.coste_oro = 0;
	}
}

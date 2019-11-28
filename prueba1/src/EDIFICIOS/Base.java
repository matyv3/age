package EDIFICIOS;
import UNIDADES.*;

public class Base extends Unidad{
	
	public Base() {
		super("Base");
		this.setAtaque(0);
		this.setDefensa(350);
		this.vida = 800;
		this.coste_madera = 0;
		this.coste_oro = 0;
	}
}

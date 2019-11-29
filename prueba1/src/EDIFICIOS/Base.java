package EDIFICIOS;
import UNIDADES.*;

public class Base extends Unidad{
	
	public Base() {
		super("Base", TipoUnidad.edificio);
		this.setAtaque(0);
		this.setDefensa(350);
		this.vida = 10; // deberian ser 800
		this.coste_madera = 0;
		this.coste_oro = 0;
	}
}

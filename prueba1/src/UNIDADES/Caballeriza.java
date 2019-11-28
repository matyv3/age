package UNIDADES;

public class Caballeriza extends Unidad {

	public Caballeriza() {
		super("caballeriza", TipoUnidad.unidad);
		this.setAtaque(15);
		this.setDefensa(7);
		this.vida = 700;
		this.coste_madera = 50;
		this.coste_oro = 8;
	}
	
	public void atacar() {
		
	}
	
	public void defender() {
		
	}
}

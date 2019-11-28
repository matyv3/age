package UNIDADES;

public class Aldeano extends Unidad {
		
	public Aldeano() {
		super("aldeano", TipoUnidad.unidad);
		this.setAtaque(5);
		this.setDefensa(3);
		this.vida = 300;
		this.coste_madera = 10;
		this.coste_oro = 1;
	}
	
	public void atacar() {
		
	}
	
	public void defender() {
		
	}
}

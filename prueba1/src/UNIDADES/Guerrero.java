package UNIDADES;

public class Guerrero extends Unidad{
	
	public Guerrero() {
		super("guerrero", TipoUnidad.unidad);
		this.setAtaque(10);
		this.setDefensa(5);
		this.vida = 500;
		this.coste_madera = 30;
		this.coste_oro = 5;
		this.icono = 'G';
	}
	
	public void atacar() {
		
	}
	
	public void defender() {
		
	}
}

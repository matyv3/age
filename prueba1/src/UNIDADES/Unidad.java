package UNIDADES;

public abstract class Unidad {
	protected String nombre;
	protected Integer ataque;
	protected Integer defensa;
	protected Integer vida;
	protected Posicion posicion;
	protected Integer coste_madera;
	protected Integer coste_oro;
	
	public Unidad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Posicion setPosicion(int x, int y) {
		this.posicion = new Posicion(x,y);
		return this.posicion;
	}
	
	public Posicion getPosicion() {
		return this.posicion;
	}
	
	public Integer getVida() {
		return this.vida;
	}
	
	public abstract void atacar();
	
	public abstract void defender();
}

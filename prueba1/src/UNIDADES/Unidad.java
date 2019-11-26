package UNIDADES;
import main.Casillero;

public abstract class Unidad {
	protected String nombre;
	protected Integer ataque;
	protected Integer defensa;
	protected Integer vida;
	protected Casillero posicion;
	protected Integer coste_madera;
	protected Integer coste_oro;
	
	public Unidad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Casillero setPosicion(int x, int y) {
		this.posicion = new Casillero();
		this.posicion.setX(x);
		this.posicion.setY(y);
		return this.posicion;
	}
	
	public Casillero getPosicion() {
		return this.posicion;
	}
	
	public Integer getVida() {
		return this.vida;
	}
	
	public abstract void atacar();
	
	public abstract void defender();
}

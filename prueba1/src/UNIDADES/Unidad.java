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
	protected char icono;
	protected TipoUnidad tipo; 
	protected Boolean accion;
	protected int turno;
	private int NumImperio;
	
	public Unidad(String nombre, TipoUnidad tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getTurno() {
		return this.turno;
	}
	
	public void setTurno(int turno) {
		this.turno = turno;
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
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Integer getCoste_oro() {
		return this.coste_oro;
	}
	
	public Integer getCoste_madera() {
		return this.coste_madera;
	}
	
	public char getIcono() {
		return this.icono;
	}
	
	public TipoUnidad getTipo() {
		return this.tipo;
	}

	public Boolean getAccion() {
		return this.accion;
	}

	public void setAccion(Boolean accion) {
		this.accion = accion;
	}

	public int getNumImperio() {
		return NumImperio;
	}

	public void setNumImperio(int numImperio) {
		NumImperio = numImperio;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefensa() {
		return defensa;
	}

	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}
}

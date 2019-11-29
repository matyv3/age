package UNIDADES;

public class Sanador extends Unidad {
	
	public Sanador() {
		super("sanador", TipoUnidad.unidad);
		this.setAtaque(0);
		this.setDefensa(5);
		this.vida = 500;
		this.coste_madera = 0;
		this.coste_oro = 0; 
		this.icono = 'S';
	}
	
	public void atacar(){
		
	}
	
	public void defender() {
		
	}
}

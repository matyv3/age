package Armas;

public class Espada implements Arma{
	
	private Integer ataque;
	private Integer defensa;
	
	public Espada() {
		this.ataque = 5;
		this.defensa = 1;
	}
	
	public Integer getAtaque() {
		return this.ataque;
	}
	
	public Integer getDefensa() {
		return this.defensa;
	}

}

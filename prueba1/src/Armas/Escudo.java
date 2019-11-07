package Armas;

public class Escudo implements Arma{
	public Integer ataque;
	public Integer defensa;
	
	public Escudo() {
		this.ataque = 0;
		this.defensa = 6;
	}
	
	public Integer getAtaque() {
		return this.ataque;
	}
	
	public Integer getDefensa() {
		return this.defensa;
	}
}

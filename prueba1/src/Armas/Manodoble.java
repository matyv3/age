package Armas;

public class Manodoble implements Arma{
	
	public Integer ataque;
	public Integer defensa;
		
	public Manodoble() {
		this.ataque = 6;
		this.defensa = 1;
	}
	
	public Integer getAtaque() {
		return this.ataque;
	}
	
	public Integer getDefensa() {
		return this.defensa;
	}
}

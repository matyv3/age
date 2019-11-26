package Armas;
import Imperios.*;

public class Spatha implements Arma{
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public Spatha() {
		this.ataque = 9;
		this.defensa = 4;
	}
	
	public Integer getAtaque() {
		return this.ataque;
	}
	
	public Integer getDefensa() {
		return this.defensa;
	}
	
	public Imperio getImperio() {
		return this.imperio;
	}
	
	public void setImperio(Imperio imperio) {
		this.imperio = imperio;
	}
}

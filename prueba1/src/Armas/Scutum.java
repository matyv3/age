package Armas;
import Imperios.*;

public class Scutum implements Arma{
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public Scutum() {
		this.ataque = 3;
		this.defensa = 10;
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

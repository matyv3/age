package Armas;
import Imperios.*;

public class EspadaRamses implements Arma{
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public EspadaRamses() {
		this.ataque = 8;
		this.defensa = 3;
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
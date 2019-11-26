package Armas;

import Imperios.Imperio;
import Imperios.Egipcio;

public class EscudoRamses implements Arma{
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public EscudoRamses() {
		this.ataque = 2;
		this.defensa = 9;
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

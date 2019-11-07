package Armas;

import Imperios.Japones;
import Imperios.Imperio;

public class EscudoJapones {
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public EscudoJapones() {
		this.ataque = 20;
		this.defensa = -5;
		this.imperio = new Japones();
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
}

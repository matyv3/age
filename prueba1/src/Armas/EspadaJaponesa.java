package Armas;
import Imperios.*;

public class EspadaJaponesa implements Arma{
	private Integer ataque;
	private Integer defensa;	
	private Imperio imperio;
	
	public EspadaJaponesa() {
		this.ataque = 11;
		this.defensa = -1;
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

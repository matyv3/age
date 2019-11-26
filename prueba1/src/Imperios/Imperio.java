package Imperios;

import java.util.ArrayList;
import java.util.List;

import EDIFICIOS.Base;
import UNIDADES.Unidad;
import UNIDADES.UnidadFactory;
import exceptions.*;

public class Imperio {

	private String nombre;
	private List<Unidad> aldeanos = new ArrayList<Unidad>();
	private List<Unidad> guerreros = new ArrayList<Unidad>();;
	private List<Unidad> caballos = new ArrayList<Unidad>();;
	private Unidad sanador;
	private Unidad base;
	private Integer oro;
	private Integer madera;
	private Integer numero;
	

	public Imperio(String nombre, Integer numero) {
		this.nombre = nombre;
		this.setNumero(numero);
		try {
			this.base = new Base();
			for (int i = 0; i < 5; i++) {
				this.agregarAldeano();
				this.agregarGuerrero();
				if (i < 3) {
					this.agregarCaballeriza();
				}
			}
			this.agregarSanador();	
		}catch(MaterialesInsuficientesException e) {
			System.out.println(e.getMessage());
		}

	}

	public String getNombre() {
		return this.nombre;
	}

	public List<Unidad> getAldeanos() {
		return this.aldeanos;
	}

	public List<Unidad> getGuerreros() {
		return this.guerreros;
	}

	public Unidad getSanador() {
		return this.sanador;
	}

	public List<Unidad> getCaballeriza() {
		return this.caballos;
	}

	public void agregarAldeano() throws MaterialesInsuficientesException {
		try {
			Unidad aldeano = UnidadFactory.crear("aldeano");
			this.descontar(aldeano);
			this.aldeanos.add(aldeano);
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
	}

	public void agregarGuerrero() throws MaterialesInsuficientesException{
		try {
			Unidad guerrero = UnidadFactory.crear("guerrero");
			this.descontar(guerrero);
			this.guerreros.add(guerrero);
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
	}

	public void agregarCaballeriza() throws MaterialesInsuficientesException {
		try {
			Unidad caballo = UnidadFactory.crear("caballeriza");
			this.descontar(caballo);
			this.caballos.add(caballo);
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
	}

	public void agregarSanador() throws MaterialesInsuficientesException {
		try {
			this.sanador = UnidadFactory.crear("sanador");
			this.descontar(sanador);
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
	}
	
	private Boolean descontar(Unidad unidad) throws MaterialesInsuficientesException {
		if(this.oro < unidad.getCoste_oro()) {
			throw new MaterialesInsuficientesException("Oro insuficiente");
		}
		if(this.madera < unidad.getCoste_madera()) {
			throw new MaterialesInsuficientesException("Madera insuficiente");
		}
		
		this.oro = this.oro - unidad.getCoste_oro();
		this.madera = this.madera - unidad.getCoste_madera();
		return true;
	}

	public Integer getOro() {
		return oro;
	}

	public void setOro(Integer oro) {
		this.oro = oro;
	}

	public Integer getMadera() {
		return madera;
	}

	public void setMadera(Integer madera) {
		this.madera = madera;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Unidad getBase() {
		return base;
	}
}

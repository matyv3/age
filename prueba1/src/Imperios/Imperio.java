package Imperios;

import java.util.ArrayList;

import java.util.List;

import EDIFICIOS.Base;
import UNIDADES.*;
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
	

	public Imperio(String nombre, Integer numero, int turno) {
		this.nombre = nombre;
		this.setNumero(turno);
		try {
			this.base = new Base();
			for (int i = 0; i < 5; i++) {
				this.agregarAldeano(turno);
				this.agregarGuerrero(turno);
				if (i < 3) {
					this.agregarCaballeriza(turno);
				}
			}
			this.agregarSanador(turno);	
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

	public Unidad agregarAldeano(int turno) throws MaterialesInsuficientesException {
		try {
			Unidad aldeano = UnidadFactory.crear("aldeano");
			this.descontar(aldeano);
			aldeano.setTurno(turno);
			this.aldeanos.add(aldeano);
			return aldeano;
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		} 
		return new Aldeano();
	}

	public Unidad agregarGuerrero(int turno) throws MaterialesInsuficientesException{
		try {
			Unidad guerrero = UnidadFactory.crear("guerrero");
			this.descontar(guerrero);
			this.guerreros.add(guerrero);
			guerrero.setTurno(turno);
			return guerrero;
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
		return new Guerrero();
	}

	public Unidad agregarCaballeriza(int turno) throws MaterialesInsuficientesException {
		try {
			Unidad caballo = UnidadFactory.crear("caballeriza");
			this.descontar(caballo);
			this.caballos.add(caballo);
			caballo.setTurno(turno);
			return caballo;
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
		return new Caballeriza();
	}

	public Unidad agregarSanador(int turno) throws MaterialesInsuficientesException {
		try {
			this.sanador = UnidadFactory.crear("sanador");
			this.descontar(sanador);
			sanador.setTurno(turno);
			return this.sanador;
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		} catch (MaterialesInsuficientesException e) {
			throw e;
		}
		return new Sanador();
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

	public int getOro() {
		return oro;
	}

	public void setOro(int oro) {
		this.oro = oro;
	}

	public Integer getMadera() {
		return madera;
	}

	public void setMadera(int madera) {
		this.madera = madera;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Unidad getBase() {
		return base;
	}
}

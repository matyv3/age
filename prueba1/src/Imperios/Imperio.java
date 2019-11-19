package Imperios;

import java.util.ArrayList;
import java.util.List;

import UNIDADES.Unidad;
import UNIDADES.UnidadFactory;
import exceptions.UnidadIncorrectaException;

public class Imperio {

	private String nombre;
	private List<Unidad> aldeanos = new ArrayList<Unidad>();
	private List<Unidad> guerreros = new ArrayList<Unidad>();;
	private List<Unidad> caballos = new ArrayList<Unidad>();;
	private Unidad sanador;

	public Imperio(String nombre) {
		this.nombre = nombre;
		for (int i = 0; i < 5; i++) {
			this.agregarAldeano();
			this.agregarGuerrero();
			if (i < 3) {
				this.agregarCaballeriza();
			}
		}
		this.agregarSanador();

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

	public void agregarAldeano() {
		try {
			this.aldeanos.add(UnidadFactory.crear("aldeano"));
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		}
	}

	public void agregarGuerrero() {
		try {
			this.guerreros.add(UnidadFactory.crear("guerrero"));
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		}
	}

	public void agregarCaballeriza() {
		try {
			this.caballos.add(UnidadFactory.crear("caballeriza"));
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		}
	}

	public void agregarSanador() {
		try {
			this.sanador = UnidadFactory.crear("sanador");
		} catch (UnidadIncorrectaException e) {
			System.out.println(e.getMessage());
		}
	}
}

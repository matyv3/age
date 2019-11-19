package main;

import java.util.*;

import Imperios.*;

public class main {

	private static Boolean gameOver = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) dar a elegir a cada personaje los imperios que van a usar
		// maximo 3 jugadores, uno por cada imperio
		List<Jugador> jugadores = obtenerJugadores();

		// 2) Crear mapa y posicionar materiales aleatoriamente
		// generarMapa();

		// 3) crear turnos
		while (gameOver) {
			System.out.println("Turno de jugador x");
			sc.nextInt();
		}

	}

	public static List<Jugador> obtenerJugadores() {

		Scanner sc = new Scanner(System.in);

		List<Jugador> jugadores = new ArrayList<Jugador>();

		while (jugadores.size() < 3) {
			System.out.println("Seleccione el imperio: ");
			System.out.println("1 - Egipcio");
			System.out.println("2 - Japones");
			System.out.println("3 - Romano");

			Jugador jugador = new Jugador();

			Integer opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				jugador.setImperio(new Egipcio());
				jugadores.add(jugador);
				break;
			case 2:
				jugador.setImperio(new Japones());
				jugadores.add(jugador);
				break;
			case 3:
				jugador.setImperio(new Romano());
				jugadores.add(jugador);
				break;
			// deberia haber un caso 0 que te permita no jugar
			default:
				System.out.println("Cualquier cosa pusiste");
				break;
			}

			int cantidadJugadores = 1;
			for (Jugador j : jugadores) {
				System.out.println("Jugador " + cantidadJugadores + " : " + j.getImperio().getNombre());
				cantidadJugadores++;
			}
		}
		return jugadores;

	}

	public static void generarMapa() {

	}
}

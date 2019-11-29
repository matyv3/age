package main;

import java.util.*;

import Imperios.*;
import UNIDADES.*;
import exceptions.*;

public class main {

	private static Boolean gameOver = true;
	
	private static Integer ANCHO = 15;
	private static Integer ALTO = 15;
	
	// private static List<Casillero> unidades = new ArrayList<Casillero>();
	private static Unidad tablerito [][] = new Unidad [15][15];
	private static Imperio Imps [] = new Imperio [2];
	private static int turno = 0;

	public static void main(String[] args) {

		// xI = X inicial de una posicion 
		// yI = Y inicial de una posicion
		
		// xF = X Final de una posicion
		// yF = Y Final de una posicion
		
		// x = X posicion en analisis
		// y = Y posicion en analisis
		
		Scanner sc = new Scanner(System.in);
		int repuesta;		
		Imps[0] = ObtenerImperio(0);
		Imps[1] = ObtenerImperio(1);				
	
		// Se inicia el Juego
		while (turno == Imps[turno].getNumero() && gameOver == true){	
			//se imprimi la matriz
			Imprimir();
			
			//se dictan el turno y las acciones posibles
			System.out.println("Turno del imperio: " + Imps[turno].getNombre() + " Acciones:");
			System.out.println("1- Crear Unidades 2-Mover");
			repuesta = sc.nextInt();
				switch (repuesta)
				{

					case 1: 
						CrearUnidad();
						break;

					case 2:
						Mover(Imps[turno].getNumero());
						break;

				}
				
			
			System.out.println("Para continuar precione 1, para finalizar turno 2");
			repuesta = sc.nextInt();

				if (repuesta == 2)
				{		
					if(turno == 0)
					{
						CambiarEstadoAccion(turno);
						turno = Imps[1].getNumero();
					}
					else
					{
						CambiarEstadoAccion(turno);
						turno = Imps[0].getNumero();
					}
				}
				
		    //Limpia la consola
			limpiarConsola();
		
		    // Consulta si algun Imperio perdio
			if(tablerito[2][2].getVida() <= 0 || tablerito[14][14].getVida( )<=0)
			{
				gameOver = false;
			}
		}

		//Consulta que imperio Gano y lo imprime
		if(tablerito[2][2].getVida( )<=0){
				System.out.println("El Imperio " + Imps[1].getNombre() + " Gan�");
		}else{
			System.out.println("El Imperio " + Imps[0].getNombre() + " Gan�");
		}
		

	}
	
	public static Imperio ObtenerImperio(int numJugador) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el imperio: ");
		System.out.println("1 - Egipcio");
		System.out.println("2 - Japones");
		System.out.println("3 - Romano");
		Integer opcion = sc.nextInt();
		Imperio imp = null;
		while(imp == null) {
			switch (opcion) {
			case 1:
				imp = new Egipcio(numJugador, numJugador);
				break;
			case 2:
				imp = new Japones(numJugador, numJugador);
				break;
			case 3:
				imp = new Romano(numJugador, numJugador);
				break;
			default:
				System.out.println("Cualquier cosa pusiste");
				break;
			}	
		}
		if(numJugador == 0) {			
			tablerito[2][2] = (Unidad) imp.getBase();
		}else {
			tablerito[14][14] = (Unidad) imp.getBase();
		}
		return imp;
	}
	
	//Metodo con logica para crear unidades y asignarle imperio y evaluar los recursos
	//segun el turno que sea crea las unidades en una esquina u otra del mapa
	public static void CrearUnidad()
	{
		
		int unidad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- Aldeano / 2- Guerrero / 3- Sanador / 4- Caballeriza");
		unidad = sc.nextInt();
		/*
		int x;
		int y;
		System.out.println("Ingrese la fila donde quiere colocar la unidad: ");
		x = sc.nextInt();
		System.out.println("Ingrese la columna donde quiere colocar la unidad: ");
		y = sc.nextInt();
		*/
			switch(unidad) 
			{
				
				case 1:
						if(turno == 0) {
							try {							
								tablerito[3][2] = Imps[turno].agregarAldeano(turno);
								tablerito[3][2].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}	
						}else {
							try {							
								tablerito[13][14] = Imps[turno].agregarAldeano(turno);
								tablerito[13][14].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}
						}
						
					break;
				case 2:
						if(turno == 0) {
							try {							
								tablerito[3][3] = Imps[turno].agregarGuerrero(turno);
								tablerito[3][3].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}
						}else {
							try {							
								tablerito[13][12] = Imps[turno].agregarGuerrero(turno);
								tablerito[13][12].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}	
						}
						
					break;
				case 3:
					if(turno == 0) {
						try {							
							tablerito[2][3] = Imps[turno].agregarSanador(turno);
							tablerito[2][3].setNumImperio(Imps[turno].getNumero());
						}catch(MaterialesInsuficientesException e) {
							System.out.println(e.getMessage());
						}
					}else {
						try {							
							tablerito[12][13] = Imps[turno].agregarSanador(turno);
							tablerito[12][13].setNumImperio(Imps[turno].getNumero());
						}catch(MaterialesInsuficientesException e) {
							System.out.println(e.getMessage());
						}
					}
						
					break;
				case 4:
						if(turno == 0) {
							try {							
								tablerito[3][3] = Imps[turno].agregarCaballeriza(turno);
								tablerito[3][3].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}	
						}else {
							try {							
								tablerito[13][13] = Imps[turno].agregarCaballeriza(turno);
								tablerito[13][13].setNumImperio(Imps[turno].getNumero());
							}catch(MaterialesInsuficientesException e) {
								System.out.println(e.getMessage());
							}	
						}
					break;
			}
			
	}
	
	
	//imprimi Matriz
	public static void Imprimir(){
		for (int i = 0; i < 15; i++)
		{
			for(int z = 0; z < 15; z++)
			{
				if(tablerito[i][z] == null)
				{
					System.out.print("|___|");
				}
				else
				{
						 System.out.print("|_" + tablerito[i][z].getIcono() + "_|");
					
				}
				if(z == 14)
				{
					System.out.print(" " + i );
				}
			
			}
			System.out.println();
		}
		
		for (int c = 0; c < 15; c++)
		{
			if(c > 9) {
				System.out.print("  " + c + " ");
			}else {				
				System.out.print("  " + c + "  ");
			}
		}
		System.out.println();
		System.out.println("Imperio: " + Imps[turno].getNombre());
		System.out.println("Oro: " + Imps[turno].getOro() + "    " + "Madera: " + Imps[turno].getMadera());
	
	}
	
	//cambia las acciones de las unidades al final del turno
	public static void CambiarEstadoAccion(int turno)
	{
		for (int i = 0; i < 15; ++i) {
			
			for(int z = 0; z < 15;z++)
			{
				if(tablerito[i][z]!= null && tablerito[i][z].getTipo() != TipoUnidad.recurso /* && tablerito[i][z].getNumero() == turno */ )
				{
					tablerito[i][z].setAccion(true);
				}
			}
		}
	}
	

	//Evalua la acciones del jugador a la hora de mover una unidad, llama a la funcion de movimiento y esta a la de combate para resolver todo
	public static void Mover(int ImpNumero) {
		
		int xI;
		int yI;
		int xF;
		int yF;
		
		Scanner sc = new Scanner(System.in);

		//se dan valores de posicion inicial
		System.out.println("Ingrese las coordenadas de la unidad que desea mover");
		System.out.print("X inicial = ");
		xI = sc.nextInt();
		System.out.println();
		
		System.out.print("Y inicial = ");
		yI = sc.nextInt();
		System.out.println();
		if(tablerito[xI][yI] == null) {
			System.out.println("retrasado no ves que no hay nada ahi");
		}else {
			//se analiza que la unidad pertenezca al imperio actual
			if(tablerito[xI][yI].getNumImperio() == ImpNumero)
			{
				//se analiza que la unidad no se haya movido en este turno
				if(tablerito[xI][yI].getAccion() == true)
				{
					tablerito[xI][yI].setAccion(false);
					
					//se dan valores de posicion Final
					System.out.println("Ingrese las coordenadas a las que se quiere mover");
					System.out.print("X Final = ");
					xF = sc.nextInt();
					System.out.println();
					
					System.out.print("Y Final = ");
					yF = sc.nextInt();
					System.out.println();
					
					
					Casillero [] Posiciones =  Camino.buscarCamino(xI, yI, xF, yF);
				
					Movimiento(Posiciones,xI, yI, xF, yF, Imps[turno].getNumero());
				}
				else
				{
					System.out.println("La Unidad ya se Movio este turno");
				}

			}
			else
			{
				System.out.print("La Seleccion elegida no le Pertenece");
			}
		}
	}
	
	//Se usa en la funcion Mover
	public static void Movimiento(Casillero [] posiciones,int xI, int yI,int xF, int yF,int NumImperio)
	{	
		
		boolean limpiar = true;
		for (int i = 0; i< (posiciones.length);i++)
		{
			int x = posiciones[i].getX();
			int y = posiciones[i].getY();
			
			if(x == xI && y == yI) {
				
			}else {
				if (tablerito[x][y] == null)
				{
					
				}
				else
				{
					//se evalua si es un recurso
					if(tablerito[x][y].getTipo() == TipoUnidad.recurso)
					{
						
						//se evalua si es un aldeano la seleccion
						if(tablerito[xI][yI].getNombre().equals("aldeano"))
						{
							//se evalua que tipo de recurso es
							if(tablerito[x][y].getNombre().equals("oro"))
							{
								int diferencia = tablerito[x][y].getVida() - tablerito[xI][yI].getAtaque();
								Imps[NumImperio].setOro(Imps[NumImperio].getOro() + 50);							
										if (diferencia > 0)
										{
											tablerito[x][y].setVida(diferencia);
											break;
										}
										else
										{
											tablerito[x][y] = tablerito[xI][yI];
											tablerito[xI][yI] = null;
											break;
										}
							}
							else
							{
								int diferencia = tablerito[x][y].getVida() - tablerito[xI][yI].getAtaque();
								Imps[NumImperio].setMadera(Imps[NumImperio].getMadera() + 50);
								
										if (diferencia > 0)
										{
											tablerito[x][y].setVida(diferencia);
											break;
										}
										else
										{
											tablerito[x][y] = tablerito[xI][yI];
											tablerito[xI][yI] = null;
											break;
										}
								
							}
							
						}
						else
						{
							//Se evalua que si es un recurso y no es un aldeano, se lo deja una posicion antes
							if (x == xF || y == yF)
							{
								x--;
								y--;
								tablerito[x][y] = tablerito[xI][yI];
								tablerito[xI][yI] = null;
								break;
								
							}		
						}
						
						
					}
					else
					{
						// si no es un recurso se llama a combate
						combate(x,y,xI,yI);
						limpiar = false;
						break;			
						
					}
					
				}
			}
		}
		if(limpiar) {
			tablerito[xF][yF] = tablerito[xI][yI];
			tablerito[xI][yI] = null;			
		}
	}
	
	//Se usa en la funcion Movimiento
	public static void combate(int x, int y, int xI, int yI){
		int UnidadDefensaVida = tablerito[x][y].getVida();
		int UnidadAtacaVida = tablerito[xI][yI].getVida();
		
		if(tablerito[x][y].getTipo() == TipoUnidad.unidad) {
			while (UnidadDefensaVida != 0 && UnidadAtacaVida != 0)
			{
				
				tablerito[x][y].setVida( tablerito[x][y].getVida() - tablerito[xI][yI].getAtaque() );
				tablerito[xI][yI].setVida(tablerito[xI][yI].getVida() - tablerito[x][y].getAtaque());
				
				 UnidadDefensaVida = tablerito[x][y].getVida();
				 UnidadAtacaVida = tablerito[xI][yI].getVida();
				
			}
			if(UnidadDefensaVida == 0)
			{
				tablerito[x][y] = tablerito[xI][yI];
				tablerito[xI][yI] = null;
			}
			else
			{
				tablerito[xI][yI] = null;
			}
		}else{
			tablerito[x][y].setVida( tablerito[x][y].getVida() - tablerito[xI][yI].getAtaque() );
			tablerito[xI][yI].setVida(tablerito[xI][yI].getVida() - tablerito[x][y].getAtaque());
			
			 UnidadDefensaVida = tablerito[x][y].getVida();
			 UnidadAtacaVida = tablerito[xI][yI].getVida();
			 
			 if(tablerito[x][y].getNombre() != "Base" && UnidadDefensaVida == 0) {
				tablerito[x][y] = tablerito[xI][yI];
				tablerito[xI][yI] = null;
			 }
		}				
	}
	
	public static void limpiarConsola()
	{
		for (int i = 0; i < 50; ++i) {
			
			for(int z = 0; z<50;z++)
			{
				System.out.println("");
			}
		}	
	}
}

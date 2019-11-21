package main;

public class Camino {
	
	
	public  Casillero [] buscarCamino(int xi, int yi, int xf, int yf) {
		int resX = xf - xi;
		int resY = yf - yi;
		Casillero [] casilleros;
		int diferenciaRecto;
		
		
		String rectasDiag = calculo(xi, yi, xf, yf);
//		System.out.println("rectas o diagonal" + rectasDiag);
		
		/*
		 * Es asi resto x fin - x inicio y tambien y, al meyr de estos le resto
		 * el menor, ese resultado son las posiciones a moverse tanto pot y y x
		 * y luego calculo diagonal
		 */
		if (rectasDiag.equals("")) {

			if (resX > resY) {
			
				if (resX > 0  && resY > 0) {
					diferenciaRecto = resX - resY;
					for (int i = 0; i < diferenciaRecto; i++) {
						rectasDiag += (xi + i) + "," + (yi) + ";";
					}
					xi += diferenciaRecto;
					
				} else if  (resX > 0  && resY < 0) {
					diferenciaRecto = Math.abs(resX) - Math.abs(resY);

					for (int i = 0; i < diferenciaRecto; i++) {
						rectasDiag += (xi + i) + "," + (yi) + ";";
					}
					xi += diferenciaRecto;
					
				}else if (resY < 0 && resX < 0) {
					diferenciaRecto = Math.abs(resY) - Math.abs(resX);

					for (int i = 0; i < Math.abs(diferenciaRecto); i++) {
						// xi -= i;
						rectasDiag += (xi-i) + "," + (yi) + ";";

					}
					xi += diferenciaRecto;
				}
				rectasDiag += calculo(xi, yi, xf, yf);
//				System.out.println("rectas o diagonalX " + rectasDiag);
				
//				System.out.println("arranco por la X");
			} else if (resX < resY) {

			

				if (resY > 0 && resX > 0) {
					diferenciaRecto = resY - resX;
					for (int i = 0; i < diferenciaRecto; i++) {
						rectasDiag += (xi) + "," + (yi + i) + ";";
					}
					yi += diferenciaRecto;
				} else if (resY > 0 && resX < 0) {
					diferenciaRecto = Math.abs(resY) - Math.abs(resX);

					for (int i = 0; i < Math.abs(diferenciaRecto); i++) {
						// xi -= i;
						rectasDiag += (xi+i) + "," + (yi) + ";";

					}
					xi += diferenciaRecto;
				} else if (resY < 0 && resX < 0) {
					diferenciaRecto = Math.abs(resY) - Math.abs(resX);

					for (int i = 0; i < Math.abs(diferenciaRecto); i++) {
						// xi -= i;
						rectasDiag += (xi-i) + "," + (yi) + ";";

					}
					xi += diferenciaRecto;
				} else if (resY < 0) {
					diferenciaRecto = Math.abs(resY) - Math.abs(resX);

					for (int i = 0; i < Math.abs(diferenciaRecto); i++) {
						// xi -= i;					
						rectasDiag += (xi+i) + "," + (yi) + ";";

					}
					xi += diferenciaRecto;	

				}

				rectasDiag += calculo(xi, yi, xf, yf);
//				System.out.println("arranco por la Y " + rectasDiag);
			}
//			rectasDiag
//			System.out.println(arrayCamin);	
		
		}
		
		if (!rectasDiag.equals("")){
			String [] array =rectasDiag.split(";");
			casilleros = new Casillero [array.length];
			for (int i = 0; i<array.length; i++ ) {
				casilleros [i]= new Casillero();
				casilleros [i].setX(new Integer(array[i].split(",")[0]));
				casilleros [i].setY(new Integer(array[i].split(",")[1]));
//				System.out.println(s);
			}
			System.out.println();
		}else{
			casilleros = new Casillero [0];
		}
		
		
		
		return casilleros;
	}

	private String calculo(int xi, int yi, int xf, int yf) {
		int resX = xf - xi;
		int resY = yf - yi;
		String arrayCamin = "";

		if (Math.abs(resX) == Math.abs(resY)) {
			if (resX > 0 && resY > 0) {
				for (int i = 0; i <= Math.abs(resX); i++) {
					arrayCamin = arrayCamin + (xi + i) + "," + (yi + i) + ";";
				}

			} else if (resX < 0 && resY > 0) {
				for (int i = 0; i <= Math.abs(resX); i++) {
					arrayCamin = arrayCamin + (xi - i) + "," + (yi + i) + ";";
				}
			} else if (resX > 0 && resY < 0) {
				for (int i = 0; i <= Math.abs(resX); i++) {
					arrayCamin = arrayCamin + (xi + i) + "," + (yi - i) + ";";
				}

			} else {
				for (int i = 0; i <= Math.abs(resX); i++) {
					
					if(i == Math.abs(resX)) {
						
						arrayCamin = arrayCamin + ((xi - i)+1) + "," + (yi - i) + ";";
					}
					else {
						arrayCamin = arrayCamin + (xi - i) + "," + (yi - i) + ";";
					}
					
				}
			}
		} else if (resX == 0) {
			if (resY > 0) {
				for (int i = 0; i <= resY; i++) {
					arrayCamin = arrayCamin + (xi) + "," + (yi + i) + ";";
				}

			} else {
				for (int i = 0; i <= (resY * -1); i++) {
					arrayCamin = arrayCamin + (xi) + "," + (yi - i) + ";";
				}
			}

		} else if (resY == 0) {
			if (resX > 0) {
				for (int i = 0; i <= resX; i++) {
					arrayCamin = arrayCamin + (xi + i) + "," + (yi) + ";";
				}

			} else {
				for (int i = 0; i <= (resX * -1); i++) {
					arrayCamin = arrayCamin + (xi - 1) + "," + (yi) + ";";
				}
			}

		}

		return arrayCamin;
	}
}

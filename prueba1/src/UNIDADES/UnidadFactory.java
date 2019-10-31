package UNIDADES;

import exceptions.UnidadIncorrectaException;

public class UnidadFactory {

    public static Unidad crear(String tipo) throws UnidadIncorrectaException {

        switch (tipo) {
        case "aldeano":
            return crearAldeano();

        case "guerrero":
            return crearGuerrero();
        
        case "caballeriza":
        	return crearCaballeriza();
        	
        case "sanador":
        	return crearSanador();
        
        case "especial":
        	return crearUnidadEspecial();
        	
        default:
            throw new UnidadIncorrectaException("Unidad Incorrecta");
        }
    }

    private static Aldeano crearAldeano() {
        return new Aldeano();
    }

    private static Guerrero crearGuerrero() {
        return new Guerrero();
    }
    
    private static Caballeriza crearCaballeriza() {
    	return new Caballeriza();
    }
    
    private static Sanador crearSanador() {
    	return new Sanador();
    }
    
    private static UnidadEspecial crearUnidadEspecial() {
    	return new UnidadEspecial();
    }
}

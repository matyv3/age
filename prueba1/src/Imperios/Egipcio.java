package Imperios;


public class Egipcio extends Imperio {

    public Egipcio(Integer numero, int turno) {
    	super("Egipcio", numero, turno);
    	this.base.setIcono('E');
    }
}

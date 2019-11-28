package Imperios;

public class Romano extends Imperio {

    public Romano(Integer numero, int turno) {
        super("Romano", numero, turno);
        this.base.setIcono('R');
    }
}

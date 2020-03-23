package elementos;

public class MonedaTresCaras extends Moneda {

    @Override
    public boolean lanzar() {
        return true;
    }

    @Override
    public Integer getCantidadCaras() {
        return 3;
    }
}

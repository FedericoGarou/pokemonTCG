package elementos;

public class MonedaSiempreSeca extends Moneda {

    @Override
    public boolean lanzar() {
        return false;
    }
}

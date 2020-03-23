package elementos;

public class Moneda {

    public boolean lanzar() {
        return Math.random() < 0.5;
    }

    public Integer getCantidadCaras(){
        Integer cantidadCaras = 0;
        while(this.lanzar()){
            cantidadCaras++;
        }
        return cantidadCaras;
    }
}

import elementos.Moneda;

public class Numel extends Pokemon {

    private Integer cantidadEnergia = 0;

    public Numel(){
        super(80);
    }

    public void agregarEnergia(int energia) {
        cantidadEnergia += energia;
    }

    public void usaCabesazoContinuo(Numel oponente, Moneda moneda) {
        if (cantidadEnergia >= 2){
            recibirDanio(30 * moneda.getCantidadCaras());
        }
    }

}

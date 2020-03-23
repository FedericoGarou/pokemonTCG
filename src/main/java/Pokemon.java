public class Pokemon {

    private Integer cantidadEnergias = 0;
    private Integer puntosVida;

    public Pokemon(Integer puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void recibirDanio(Integer puntosDanio) {
        if(puntosVida > puntosDanio){
            puntosVida -= puntosDanio;
        }else{
            puntosVida = 0;
        }
    }

    public Integer puntosVida() {
        return this.puntosVida;
    }

    public boolean estaDebilitado() {
        return puntosVida == 0;
    }

    public void agregarEnergia(Integer energia) {
        cantidadEnergias += energia;
    }

    public Integer energia() {
        return this.cantidadEnergias;
    }
}

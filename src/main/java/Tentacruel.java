import elementos.Moneda;
import exception.EnergiaInsuficienteException;

public class Tentacruel extends Pokemon {

    private boolean estadoEnvenamiento = false;
    private boolean estaParalizado = false;

    public Tentacruel(){
        super(110);
    }

    public void usaAguijonVenenoso(Tentacruel oponente) {
        if(energia() >= 2){
            oponente.quedarEnvenenado();
            oponente.recibirDanio(30);
        }else {
            throw new EnergiaInsuficienteException();
        }
    }

    public void usaTentaculoHirviente(Tentacruel oponente, Moneda moneda) {
        if(energia() < 3){
            throw new EnergiaInsuficienteException();
        }

        if(moneda.lanzar()){
            oponente.recibirDanio(80);
        }else{
            oponente.recibirDanio(40);
            oponente.paralizarlo();
        }
    }

    public void usaTentaculoHirviente(Tentacruel oponente) {
        this.usaTentaculoHirviente(oponente,new Moneda());
    }

    public boolean estaParalizado() {
        return estaParalizado;
    }

    public boolean estaEnvenenado() {
        return estadoEnvenamiento;
    }

    private void quedarEnvenenado(){
        this.estadoEnvenamiento = true;
    }

    private void paralizarlo() {
        this.estaParalizado = true;
    }


}

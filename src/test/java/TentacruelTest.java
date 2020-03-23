import elementos.Moneda;
import elementos.MonedaSiempreCara;
import elementos.MonedaSiempreSeca;
import exception.EnergiaInsuficienteException;
import org.junit.Assert;
import org.junit.Test;

public class TentacruelTest {

    @Test
    public void unTentacruelTieneCientoDiezPuntosDeVidaAlNacer() {
        Tentacruel tentacruel = new Tentacruel();
        Assert.assertEquals(Integer.valueOf(110),tentacruel.puntosVida());
    }

    @Test
    public void AlUsarAguijonVenenosoElOponenteQuedaEnvenenado() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        tentacruel.agregarEnergia(2);
        tentacruel.usaAguijonVenenoso(oponente);
        Assert.assertTrue(oponente.estaEnvenenado());
    }

    @Test
    public void AlUsarAguijonVenenosoElOponentePierdeTreintaPuntosDeVida() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        tentacruel.agregarEnergia(2);
        tentacruel.usaAguijonVenenoso(oponente);
        Assert.assertEquals(Integer.valueOf(80), oponente.puntosVida());
    }

    @Test(expected = EnergiaInsuficienteException.class)
    public void NoPuedeUsarAguijonVenenosoSiTieneMenosDeDosEstrellas() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        tentacruel.agregarEnergia(1);
        tentacruel.usaAguijonVenenoso(oponente);
    }

    @Test(expected = EnergiaInsuficienteException.class)
    public void noPuedeUsarTentaculosHirvientesSiTieneMenosDeTresEstrellas() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        tentacruel.agregarEnergia(2);
        tentacruel.usaTentaculoHirviente(oponente);
    }

    @Test
    public void AlUsarTentaculosHirvientesElOponenteNoQuedaEnvenenado() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        tentacruel.agregarEnergia(3);
        tentacruel.usaTentaculoHirviente(oponente);
        Assert.assertFalse(oponente.estaEnvenenado());
    }

    @Test
    public void AlUsarTentaculosHirvientesSaleCaraAtaca40masDanio() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        Moneda moneda = new MonedaSiempreCara();
        tentacruel.agregarEnergia(3);
        tentacruel.usaTentaculoHirviente(oponente,moneda);
        Assert.assertEquals(Integer.valueOf(30), oponente.puntosVida());
        Assert.assertFalse(oponente.estaParalizado());
    }

    @Test
    public void AlUsarTentaculosHirvientesSaleSecaYParaliza() {
        Tentacruel tentacruel = new Tentacruel();
        Tentacruel oponente = new Tentacruel();
        Moneda moneda = new MonedaSiempreSeca();
        tentacruel.agregarEnergia(3);
        tentacruel.usaTentaculoHirviente(oponente,moneda);
        Assert.assertEquals(Integer.valueOf(70), oponente.puntosVida());
        Assert.assertTrue(oponente.estaParalizado());
    }


}

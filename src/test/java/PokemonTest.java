import org.junit.Assert;
import org.junit.Test;

public class PokemonTest {

    @Test
    public void siQuedaSinPuntosDeVidaSeDebilita() {
        Pokemon pokemon = new Pokemon(150);
        pokemon.recibirDanio(151);
        Assert.assertEquals(Integer.valueOf(0), pokemon.puntosVida());
        Assert.assertTrue(pokemon.estaDebilitado());
    }

    @Test
    public void puedoAsignarleEnergiaAUnPokemon() {
        Pokemon pokemon = new Pokemon(10);
        pokemon.agregarEnergia(1);
        Assert.assertEquals(Integer.valueOf(1),pokemon.energia());
    }
    
}

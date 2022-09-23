package test;

import exception.AnimalInexistenteException;
import model.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CachorroTest {

    @Test
    public void emitirSomSucessoTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Cachorro");
        assertEquals("AU AU", animal.emitirSom());
    }

    @Test
    public void emitirSomFalhaTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Cachorro");
        assertNotEquals("LATIDO", animal.emitirSom());
    }

}

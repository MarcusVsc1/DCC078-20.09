package test;

import exception.AnimalInexistenteException;
import model.Animal;
import model.Cachorro;
import model.Errada;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void pesoAnimalCorretoTest() throws AnimalInexistenteException {
        Animal cachorro = new Animal(new Cachorro());
        cachorro.setPeso(70f);
        Float esperado = 70f;
        assertEquals(esperado, cachorro.getPeso());
    }

    @Test
    public void pesoAnimalIncorretoTest() throws AnimalInexistenteException {
        Animal cachorro = new Animal(new Cachorro());
        cachorro.setPeso(70f);
        Float esperado = 60f;
        assertNotEquals(esperado, cachorro.getPeso());
    }

    @Test
    public void animalNuloTest() throws AnimalInexistenteException {
        try {
            Animal cachorro = new Animal(null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Animal nulo - INVÁLIDO", e.getMessage());
        }
    }
}

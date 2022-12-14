package test;

import exception.AnimalInexistenteException;
import model.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PeriquitoTest {

    @Test
    public void emitirSomSucessoTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Periquito");
        assertEquals("FLAMENGO", animal.emitirSom());
    }

    @Test
    public void emitirSomFalhaTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Periquito");
        assertNotEquals("FLUMINENSE", animal.emitirSom());
    }
}

package test;

import exception.AnimalInexistenteException;
import model.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GatoTest {

    @Test
    public void emitirSomSucessoTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Gato");
        assertEquals("MIAU", animal.emitirSom());
    }

    @Test
    public void emitirSomFalhaTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Gato");
        assertNotEquals("MEAAAAU", animal.emitirSom());
    }

}

package test;

import exception.AnimalInexistenteException;
import model.Animal;
import model.Gato;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GatoTest {

    @Test
    public void emitirSomSucessoTest() throws AnimalInexistenteException {
        Animal animal = new Animal(new Gato());
        assertEquals("MIAU", animal.emitirSom());
    }

    @Test
    public void emitirSomFalhaTest() throws AnimalInexistenteException {
        Animal animal = new Animal(new Gato());
        assertNotEquals("MEAAAAU", animal.emitirSom());
    }

}

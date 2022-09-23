package test;

import exception.AnimalInexistenteException;
import model.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void naoEncontradoTest() {
        try {
            Animal animal = new Animal("Fenix");
            fail();
        } catch (AnimalInexistenteException e) {
            assertEquals("Animal inexistente!", e.getMessage());
        }
    }

    @Test
    public void classeIncorretaTest() {
        try {
            Animal animal = new Animal("Errada");
            fail();
        } catch (AnimalInexistenteException e) {
            assertEquals("Não se trata de um TipoAnimal, classe inválida!", e.getMessage());
        }
    }

    @Test
    public void pesoAnimalCorretoTest() throws AnimalInexistenteException {
        Animal cachorro = new Animal ("Cachorro");
        cachorro.setPeso(70f);
        Float esperado = 70f;
        assertEquals(esperado, cachorro.getPeso());
    }

    @Test
    public void pesoAnimalIncorretoTest() throws AnimalInexistenteException {
        Animal cachorro = new Animal ("Cachorro");
        cachorro.setPeso(70f);
        Float esperado = 60f;
        assertNotEquals(esperado, cachorro.getPeso());
    }

}

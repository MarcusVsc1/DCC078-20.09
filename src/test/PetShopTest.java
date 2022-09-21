package test;

import exception.AnimalInexistenteException;
import model.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PetShopTest {

    @Test
    public void cachorroTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Cachorro");
        assertEquals(animal.emitirSom(), "AU AU");
    }

    @Test
    public void gatoTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Gato");
        assertEquals(animal.emitirSom(), "MIAU");
    }

    @Test
    public void periquitoTest() throws AnimalInexistenteException {
        Animal animal = new Animal("Periquito");
        assertEquals(animal.emitirSom(), "FLAMENGO");
    }


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
            assertEquals("Não se trata de um animal, classe inválida!", e.getMessage());
        }
    }

}

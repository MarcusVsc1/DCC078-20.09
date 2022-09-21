package model;

import interfaces.TipoAnimal;

public class Gato implements TipoAnimal {

    @Override
    public String emitirSom() {
        return "MIAU";
    }


}

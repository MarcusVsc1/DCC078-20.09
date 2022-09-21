package model;

import interfaces.TipoAnimal;

public class Periquito implements TipoAnimal {

    @Override
    public String emitirSom() {
        return "FLAMENGO";
    }
}

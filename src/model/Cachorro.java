package model;

import interfaces.TipoAnimal;

public class Cachorro implements TipoAnimal {

    @Override
    public String emitirSom() {
        return "AU AU";
    }


}

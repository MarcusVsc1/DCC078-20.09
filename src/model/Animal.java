package model;

import exception.AnimalInexistenteException;
import interfaces.TipoAnimal;

public class Animal {

    private Float peso;
    private TipoAnimal tipoAnimal;

    public Animal(TipoAnimal tipoAnimal) throws AnimalInexistenteException {
        if(tipoAnimal == null) {
            throw new NullPointerException("Animal nulo - INVÁLIDO");
        }
        this.tipoAnimal = tipoAnimal;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String emitirSom(){
        return this.tipoAnimal.emitirSom();
    }

}

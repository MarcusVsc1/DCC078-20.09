package model;

import exception.AnimalInexistenteException;
import interfaces.TipoAnimal;

public class Animal {

    private Float peso;
    private TipoAnimal tipoAnimal;


    public Animal(String tipoAnimal) throws AnimalInexistenteException {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("model." + tipoAnimal);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new AnimalInexistenteException("Animal inexistente!");
        }
        if (!(objeto instanceof TipoAnimal)) {
            throw new AnimalInexistenteException("Não se trata de um animal, classe inválida!");
        }
        this.tipoAnimal = (TipoAnimal) objeto;
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

    public void lancaExcecao() {
        throw new IllegalArgumentException("animal inexistente");
    }
}

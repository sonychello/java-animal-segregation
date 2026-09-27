package org.example.animals.mammals.predatory.feline.manul;

import org.example.animals.mammals.predatory.feline.Feline;

public class Manul extends Feline{
    public Manul() {
        name = "Pushka";
    }

    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

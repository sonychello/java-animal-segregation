package org.example.animals.mammals.insectivores.hedgehogs.hedgehog;

import org.example.animals.mammals.insectivores.hedgehogs.Hedgehogs;

public class Hedgehog extends Hedgehogs {
    public Hedgehog() {
        name = "Fur";
    }

    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

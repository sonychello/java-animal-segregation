package org.example.animals.mammals.predatory.feline.lynx;

import org.example.animals.mammals.predatory.feline.Feline;

public class Lynx extends Feline {
    public Lynx() {
        name = "Myuka";
    }

    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

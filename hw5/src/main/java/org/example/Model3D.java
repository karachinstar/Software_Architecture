package org.example;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Класс, представляющий 3D модель.
 */
class Model3D implements Entity {

    private static int counter = 10000;
    private int id;
    private String name;
    private Collection<Texture> textures = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    public Model3D() {
    }

    public Model3D(String name) {
        this.name = name;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    @Override
    public String toString() {
        return String.format("3DModel #%s: %s", id, name);
    }
}

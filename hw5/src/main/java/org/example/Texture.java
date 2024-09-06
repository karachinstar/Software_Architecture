package org.example;

/**
 * Класс, представляющий текстуру.
 */
class Texture implements Entity {

    private static int counter = 50000;
    private int id;
    private String name;

    {
        id = ++counter;
    }

    @Override
    public int getId() {
        return id;
    }

    public Texture() {
    }

    public Texture(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Texture #%s: %s", id, name);
    }
}

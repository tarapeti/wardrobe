package com.codecool;

public class Cloth {
    String name;
    String type;

    public Cloth(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "name: " + name + " type: " + type;
    }
}

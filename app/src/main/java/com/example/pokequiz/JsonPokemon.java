package com.example.pokequiz;

public class JsonPokemon {
    private String name;
    private String img;

    public JsonPokemon(String name, String img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

}

package com.dwightterencetablizo;

import java.util.Objects;

public class Card {
    private int id;
    private String name;

    // Constructor
    public Card(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

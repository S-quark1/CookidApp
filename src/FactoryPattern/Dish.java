package FactoryPattern;

import FactoryPattern.Ingredients.Pasta.Pasta;
import FactoryPattern.Ingredients.Sauces.Sauce;

public class Dish {
    String name;
    Pasta pasta;
    Sauce sauce;

    public Dish(String name, Pasta pasta, Sauce sauce) {
        this.name = name;
        this.pasta = pasta;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return name + ", sauce: " + sauce.getName() + ", pasta type: " + pasta.getName();
    }
}

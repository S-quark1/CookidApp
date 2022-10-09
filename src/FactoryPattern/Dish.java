package FactoryPattern.Ingredients.Pasta;

import FactoryPattern.Ingredients.Sauces.Sauce;

public abstract class Pasta {
    String name;
    Sauce sauce;

    abstract void prepare();

}

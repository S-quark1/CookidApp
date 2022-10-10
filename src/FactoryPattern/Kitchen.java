package FactoryPattern;

import FactoryPattern.Ingredients.Pasta.Lasagna;
import FactoryPattern.Ingredients.Pasta.Macaroni;
import FactoryPattern.Ingredients.Pasta.Pasta;
import FactoryPattern.Ingredients.Pasta.Spaghetti;
import FactoryPattern.Ingredients.Sauces.Bolognese;
import FactoryPattern.Ingredients.Sauces.Carbonara;
import FactoryPattern.Ingredients.Sauces.Cheese;
import FactoryPattern.Ingredients.Sauces.Sauce;

import javax.xml.namespace.QName;

public class Kitchen {
    public Dish createPasta(int type, int Sauce, String name){
        Pasta pasta = null;
        Sauce sauce = null;
        switch (type) {
            case 1 -> pasta = new Spaghetti();
            case 2 -> pasta = new Lasagna();
            case 3 -> pasta = new Macaroni();
        }
        switch (Sauce) {
            case 1 -> sauce = new Bolognese();
            case 2 -> sauce = new Cheese();
            case 3 -> sauce = new Carbonara();
        }

        return new Dish(name, pasta, sauce);
    }
}

package FactoryPattern;

import FactoryPattern.pasta.Lasagna;
import FactoryPattern.pasta.Macaroni;
import FactoryPattern.pasta.Spaghetti;

public class PastaFactory {
    public Pasta createPasta(int type){
        Pasta pasta = null;
        switch (type) {
            case 0 -> pasta = new Spaghetti();
            case 1 -> pasta = new Lasagna();
            case 2 -> pasta = new Macaroni();
            default -> {
            }
        }
        return pasta;
    }
}

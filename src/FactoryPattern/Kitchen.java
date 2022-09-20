package FactoryPattern;

public class Kitchen {
    PastaFactory factory;

    public Kitchen(PastaFactory factory){
        this.factory = factory;
    }

    public Pasta makePasta(int type){
        Pasta pasta = factory.createPasta(type);
        return pasta;
    }
}

package problems.section4;

public class ParrotLivesNearADuck extends ParrotDecorator {

    public ParrotLivesNearADuck(Parrot parrot) {
        super(parrot);
    }

    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }
}

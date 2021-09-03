package problems.section4;

public class ParrotLivingWithDog extends ParrotDecorator {

    public ParrotLivingWithDog(Parrot parrot) {
        super(parrot);
    }

    @Override
    public void sing() {
        System.out.println("Woof, woof");
    }
}

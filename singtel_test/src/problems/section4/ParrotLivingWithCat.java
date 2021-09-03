package problems.section4;

public class ParrotLivingWithCat extends ParrotDecorator {

    public ParrotLivingWithCat(Parrot parrot) {
        super(parrot);
    }

    @Override
    public void sing() {
        System.out.println("Me ow");
    }
}

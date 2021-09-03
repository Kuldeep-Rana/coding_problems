package problems.section4;

public class ParrotLivingWithRooster extends ParrotDecorator {

    public ParrotLivingWithRooster(Parrot parrot) {
        super(parrot);
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}

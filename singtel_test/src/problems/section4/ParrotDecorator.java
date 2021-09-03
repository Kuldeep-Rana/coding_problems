package problems.section4;

import problems.intfc.Sing;

public class ParrotDecorator implements Sing {

    private Parrot parrot;

    public ParrotDecorator (Parrot parrot){
        this.parrot = parrot;
    }

    @Override
    public void sing() {
        this.parrot.sing();
    }
}

package problems.section2and3;

import problems.intfc.Fly;
import problems.intfc.Swim;

public class Duck extends Bird implements Fly, Swim {

    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }
}

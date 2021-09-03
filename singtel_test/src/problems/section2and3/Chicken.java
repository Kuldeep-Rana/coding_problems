package problems.section2and3;

import problems.Sex;
import problems.intfc.Sing;

public class Chicken extends Bird {

    @Override
    public void sing() {
        if(this.sex == Sex.FEMALE) {
            System.out.println("Cluck, cluck");
        }else{
            System.out.println("Cock-a-doodle-doo");
        }
    }
}

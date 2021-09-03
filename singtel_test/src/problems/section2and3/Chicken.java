package problems.section2and3;

import problems.Sex;

public class Chicken extends Bird implements Sing{

    @Override
    public void sing() {
        if(this.sex == Sex.FEMALE) {
            System.out.println("Cluck, cluck");
        }else{
            System.out.println("Cock-a-doodle-doo");
        }
    }
}

package problems.section2and3;

public class Duck extends Bird implements Fly, Swim{

    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }
}

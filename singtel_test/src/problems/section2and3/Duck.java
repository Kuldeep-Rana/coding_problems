package problems.section2and3;

public class Duck extends Bird implements Fly, Sing{

    @Override
    public void sing() {
        System.out.println("Quack , quack");
    }
}

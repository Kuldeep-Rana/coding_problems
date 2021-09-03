package problems.intfc;

public interface Sing {

    default void sing(){
        System.out.println("I am singing");
    }
}

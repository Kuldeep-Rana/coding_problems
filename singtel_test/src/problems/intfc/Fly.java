package problems.intfc;

public interface Fly {

    default void fly() {
        System.out.println("I am flying");
    }
}

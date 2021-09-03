package problems.section2and3;

public interface Fly {

    default void fly() {
        System.out.println("I am flying");
    }
}

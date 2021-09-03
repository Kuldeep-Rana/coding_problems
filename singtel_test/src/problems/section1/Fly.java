package problems.section1;

public interface Fly {

    default void fly() {
        System.out.println("I am flying");
    }
}

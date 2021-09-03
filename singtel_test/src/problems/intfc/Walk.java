package problems.intfc;

public interface Walk {

    default void walk(){
        System.out.println("I am walking");
    }
}

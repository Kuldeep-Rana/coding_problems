package problems.intfc;

public interface Swim {

    default void swim(){
        System.out.println("I can swim");
    }
}

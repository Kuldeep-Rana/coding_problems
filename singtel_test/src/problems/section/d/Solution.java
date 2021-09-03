package problems.section.d;

import problems.Color;
import problems.Size;
import problems.section.b.Clownfish;
import problems.section.b.Dolphin;
import problems.section.b.Fish;
import problems.section.b.Shark;
import problems.section.c.Insect;
import problems.Animal;
import problems.section1.Bird;
import problems.section2and3.Chicken;
import problems.section2and3.Duck;
import problems.section4.Parrot;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

   static Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Parrot(),
            new Fish(),
            new Shark(Color.GREY, Size.LARGE),
            new Clownfish(Color.ORANGE, Size.SMALL),
            new Dolphin(),
            new Insect()
    };

    public static void main(String[] args) {
      /*  Stream.of(animals).filter(animal -> animal.fly()).count();
        Stream.of(animals).filter(animal -> animal.walk()).count();
        Stream.of(animals).filter(animal -> animal.sing()).count();
        Stream.of(animals).filter(animal -> animal.swim()).count();*/
    }

}

package problems.section.b;

import problems.Color;
import problems.Size;

public class Solution {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim();

        Fish shark = new Shark(Color.GREY, Size.LARGE);
        shark.swim();
        System.out.println(shark.getColor());
        System.out.println(shark.getSize());

        Fish clownFish = new Clownfish(Color.ORANGE , Size.SMALL);
        clownFish.swim();
        System.out.println(clownFish.getColor());
        System.out.println(clownFish.getSize());


        Dolphin dolphin = new Dolphin();
        dolphin.swim();


    }
}

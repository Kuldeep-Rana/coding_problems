package problems.section4;

import problems.Sex;

public class Solution {

    public static void main(String[] args) {
            ParrotLivingWithCat parrotLivingWithCat = new ParrotLivingWithCat(new Parrot());
            parrotLivingWithCat.sing();

        ParrotLivingWithRooster parrotLivingWithRooster = new ParrotLivingWithRooster(new Parrot());
        parrotLivingWithRooster.sing();

        ParrotLivingWithDog parrotLivingWithDog = new ParrotLivingWithDog(new Parrot());
        parrotLivingWithDog.sing();

        ParrotLivesNearADuck parrotLivesNearADuck = new ParrotLivesNearADuck(new Parrot());
        parrotLivesNearADuck.sing();


    }
}


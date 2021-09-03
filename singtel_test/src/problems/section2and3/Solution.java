package problems.section2and3;

import problems.Sex;

public class Solution {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();

        Chicken chicken = new Chicken();
        chicken.sex = Sex.FEMALE;
        chicken.sing();

        Chicken rooster = new Chicken();
        rooster.sex = Sex.MALE;
        rooster.sing();
    }
}


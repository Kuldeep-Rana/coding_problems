package problems.section.c;

public class Solution {

    public static void main(String[] args) {
        Insect insect = new Insect();
        insect.crawl();
        insect.fly();

        System.out.println(" ================================ ");
        insect.transform(new ButterFlyState());

        insect.crawl();
        insect.fly();

    }
}

package problems.section.c;

import problems.intfc.State;

public class ButterFlyState implements State {

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canCrawl() {
        return false;
    }
}

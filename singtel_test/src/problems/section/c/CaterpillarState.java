package problems.section.c;

import problems.intfc.State;

public class CaterpillarState implements State {

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canCrawl() {
        return true;
    }
}

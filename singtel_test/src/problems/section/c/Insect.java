package problems.section.c;
import problems.intfc.State;

public class Insect {
    private State state;

    public Insect() {
         state = new CaterpillarState();
    }

    public void transform(State state){
        this.state = state;
    }

    public void fly(){
        if(this.state.canFly()){
            System.out.println("Yee I can fly now ");
        }else{
            System.out.println("nah you are pushing me to fly but I can't");

        }

    }
    public void crawl(){
        if(this.state.canCrawl()){
            System.out.println("I can only crawl ");
        }else{
            System.out.println("Crawling is a thing of past");
        }
    }

}

package problems.section.b;

import problems.Color;
import problems.Size;

public class Clownfish extends  Fish{

    public Clownfish(Color color, Size size){
        super(color,size);
    }

    public void makeJokes(){
        System.out.println("I can make jokes");
    }
}

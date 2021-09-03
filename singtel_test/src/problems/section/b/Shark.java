package problems.section.b;

import problems.Color;
import problems.Size;

public class Shark extends Fish{

    public Shark(Color color, Size size){
        super(color,size);
    }

    public void eat(){
        System.out.println("I can eat other fish");
    }
}

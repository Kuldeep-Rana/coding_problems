package problems.section.b;

import problems.Color;
import problems.Size;
import problems.intfc.Swim;
import problems.Animal;

public class Fish extends Animal implements Swim {

    private Color color;
    private Size size;

    public Fish(){}

    public Fish(Color color, Size size){
        this.color = color;
        this.size = size;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}

package academy.learnprogramming;

public class Wall {
    private double width;
    private double height;

    //constructors
    public Wall () {
        this.width = 0;
        this.height = 0;
    }
    public Wall (double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    //getters
    public double getWidth () {
        return this.width;
    }
    public double getHeight () {
        return this.height;
    }
    public double getArea () {
        return this.width * this.height;
    }

    //setters
    public void setWidth (double width) {
        this.width = width < 0 ? 0 : width;
    }
    public void setHeight (double height) {
        this.height = height < 0 ? 0 : height;
    }

}

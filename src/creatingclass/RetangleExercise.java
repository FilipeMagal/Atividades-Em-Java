package creatingclass;

public class RetangleExercise {
    public double width;
    public double height;

    public double area(){

        return width * height;
    }
    public double perimeter(){
        return 2 * (height + width);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

}

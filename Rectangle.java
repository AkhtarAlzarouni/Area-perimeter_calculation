public class Rectangle extends Shape{

    double height;
    double width;

    @Override
     void calcArea() {
        double x=width*height;
        System.out.println("the Area = " +x);
    }

    void calcPermitere(){
        double y = 2 * (height + width);
        System.out.println(" Permitere ");

    }
}

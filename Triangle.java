public class Triangle extends Shape{
    double height;
    double width;
    double h;


    @Override
    void calcArea() {
        double x=2/(width*height);
        System.out.println("the Area = " +x);
    }

    void calcPermitere(){
        double y = (height + width + h);
        System.out.println(" Permitere = " +y);

    }
}


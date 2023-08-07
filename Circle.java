public class Circle extends Shape{
    double r;


    @Override
    void calcArea() {
        double x=2*3.14*r;
        System.out.println("the Area = " +x);
    }

    void calcPermitere(){
        double y=3.14*r*r;
        System.out.println(" Permitere = " +y);

    }
}


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Rectangle r=new Rectangle();
     r.height=26.9;
     r.width=23.66;
     r.calcPermitere();
     r.calcArea();

     Triangle t=new Triangle();
     t.width=39.9;
     t.height=627;
     t.calcPermitere();
     t.calcArea();

     Circle c=new Circle();
     c.r=45;
     c.calcPermitere();
     c.calcArea();
    }
}
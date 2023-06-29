import java.util.Scanner;

public abstract class Esfera extends Circulo {
    double radioe;
    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese el radio ");
        double radioe = sc.nextDouble();
        this.radioe = radioe;
    }
    public Esfera() {
    }
    @Override
    public double CalcularArea(){
        return 4*3.1416*(Math.pow(radioe,2));
    }
    @Override
    public double CalcularVolumen(){
        return (4/3)*3.1416*(Math.pow(radioe,3));
    }

}

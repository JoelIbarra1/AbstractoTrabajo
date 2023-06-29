import java.util.Scanner;

public abstract class Circulo extends Figura {
    double radio;
    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese el radio ");
        double radio = sc.nextDouble();
        this.radio = radio;
    }
    public Circulo() {
    }

    @Override
    public double CalcularPerimetro(){
        return 2*3.1416*radio;
    }

    @Override
    public double CalcularArea(){
        return Math.pow(radio,2)*3.1416;
    }

}

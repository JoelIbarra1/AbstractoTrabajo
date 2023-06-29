import java.util.Scanner;
public abstract class Cuadrado extends Figura {
    double lado;
    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese la distancia de los lados ");
        double lado = sc.nextDouble();
        this.lado = lado;
    }

    public Cuadrado() {
    }

    @Override
    public double CalcularPerimetro(){
        return lado*4;
    }


    @Override
    public double CalcularArea(){
        return Math.pow(lado,2);
    }
}

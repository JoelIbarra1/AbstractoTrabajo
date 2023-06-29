import java.util.Scanner;
public abstract class Triangulo extends Figura {
    double ladot;
    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese la distancia de los lados ");
        double ladot = sc.nextDouble();
        this.ladot = ladot;
    }
    public Triangulo() {
    }

    @Override
    public double CalcularPerimetro(){
        return ladot*3;
    }

    @Override
    public double CalcularArea(){
        return (Math.pow(ladot,2)*Math.sqrt(3))/4;
    }

}

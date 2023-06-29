import java.util.Scanner;

public abstract class Cubo extends Cuadrado {
    double ladoc;
    double profundiad;

    public void IngresaPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la componente x del punto ");
        double x = sc.nextDouble();
        System.out.println("ingrese la componente y del punto ");
        double y = sc.nextDouble();
        System.out.println("ingrese la componente z del punto ");
        double z = sc.nextDouble();
        System.out.println("ingrese la distancia de los lados ");
        double ladoc = sc.nextDouble();
        System.out.println("ingrese la profundidad");
        double profundi = sc.nextDouble();
        this.ladoc = ladoc;
        this.profundiad = profundi;
    }

    public Cubo (){
    }
    @Override
    public double CalcularPerimetro(){
        return ladoc*12;
    }
    @Override
    public double CalcularArea(){
        return Math.pow(ladoc,2)*6;
    }
    @Override
    public double CalcularVolumen(){
        return ladoc*ladoc*ladoc;
    }

}

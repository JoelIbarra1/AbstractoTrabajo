import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:" +
                " 1 = cuadrado " +
                " 2 = triangulo" +
                " 3 = circulo" +
                " 4 = cubo " +
                " 5 = piramide " +
                " 6 = esfera ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado cuadrado");
                Cuadrado cuadrado = new Cuadrado() {
                    @Override
                    public double CalcularPerimetro() {
                        return lado*4;
                    }
                    @Override
                    public double CalcularArea() {
                        return Math.pow(lado,2);
                    }
                    @Override
                    public double CalcularVolumen() {
                        return 0;
                    }
                };
                cuadrado.IngresaPuntos();
                double perimetro = cuadrado.CalcularPerimetro();
                double area = cuadrado.CalcularArea();
                System.out.println("el perimetro del cuadrado es " + perimetro);
                System.out.println("el area del cuadrado es " + area);
            case 2:
                System.out.println("Ha seleccionado triangulo");
                Triangulo triangulo = new Triangulo() {
                    @Override
                    public double CalcularArea(){
                        return (Math.pow(ladot,2)*Math.sqrt(3))/4;
                    }
                    @Override
                    public double CalcularPerimetro(){
                        return ladot*3;
                    }
                    @Override
                    public double CalcularVolumen() {
                        return 0;
                    }
                };
                triangulo.IngresaPuntos();
                double perimetrot = triangulo.CalcularPerimetro();
                double areat = triangulo.CalcularArea();
                System.out.println("el perimetro del triangulo es " +perimetrot);
                System.out.println("el area del triangulo es " +areat);
                break;
            case 3:
                System.out.println("Ha seleccionado circulo");
                Circulo circulo = new Circulo() {
                    @Override
                    public double CalcularArea(){
                        return Math.pow(radio,2)*3.1416;
                    }
                    @Override
                    public double CalcularPerimetro(){
                        return 2*3.1416*radio;
                    }
                    @Override
                    public double CalcularVolumen() {
                        return 0;
                    }
                };
                circulo.IngresaPuntos();
                double perimetroc = circulo.CalcularPerimetro();
                double areac = circulo.CalcularArea();
                System.out.println("el perimetro del circulo es " +perimetroc);
                System.out.println("el area del circulo es " +areac);
                break;
            case 4:
                System.out.println("Ha seleccionado cubo");
                Cubo cubo = new Cubo() {
                    @Override
                    public double CalcularPerimetro() {
                        return ladoc*12;
                    }
                    @Override
                    public double CalcularArea() {
                        return Math.pow(ladoc,2)*6;
                    }
                    @Override
                    public double CalcularVolumen() {
                        return ladoc*ladoc*ladoc;
                    }
                };
                cubo.IngresaPuntos();
                double perimetrocu = cubo.CalcularPerimetro();
                double areacu = cubo.CalcularArea();
                double volumencu = cubo.CalcularVolumen();
                System.out.println("el perimetro del cubo es " +perimetrocu);
                System.out.println("el area del cubo es " +areacu);
                System.out.println("el volumen del cubo es " +volumencu);
                break;
            case 5:
                System.out.println("Ha seleccionado piramide");
                Piramide piramide = new Piramide() {
                    @Override
                    public double CalcularArea(){
                        return Math.pow(ladop,2)+(2*ladop*alturat);
                    }
                    @Override
                    public double CalcularVolumen(){
                        return (1/3*Math.pow(ladop,2)*altura);
                    }
                    @Override
                    public double CalcularPerimetro() {
                        return 0;
                    }
                };
                piramide.IngresaPuntos();
                double areapi = piramide.CalcularArea();
                double volumenpi = piramide.CalcularVolumen();
                System.out.println("el area superficial de la piramide es " +areapi);
                System.out.println("el volumen de la piramide es " +volumenpi);
                break;
            case 6:
                System.out.println("Ha seleccionado esfera ");
                Esfera esfera = new Esfera() {
                    @Override
                    public double CalcularArea(){
                        return 4*3.1416*(Math.pow(radioe,2));
                    }
                    @Override
                    public double CalcularVolumen(){
                        return (4/3)*3.1416*(Math.pow(radioe,3));
                    }
                    @Override
                    public double CalcularPerimetro() {
                        return 0;
                    }
                };
                esfera.IngresaPuntos();
                double areaes = esfera.CalcularArea();
                double volumenes = esfera.CalcularVolumen();
                System.out.println("el area superficial de la piramide es " +areaes);
                System.out.println("el volumen de la piramide es " +volumenes);
                break;
            default:
                System.out.println("Opción inválida. Seleccione un número del 1 al 6.");
                break;
        }
        scanner.close();
    }
}
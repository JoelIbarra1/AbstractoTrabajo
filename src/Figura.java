import java.util.ArrayList;
import java.util.List;

public abstract class Figura {
    List<Punto> ListadePuntos = new ArrayList<>();

    public abstract double CalcularPerimetro();
    public abstract double CalcularArea();
    public abstract double CalcularVolumen();



}

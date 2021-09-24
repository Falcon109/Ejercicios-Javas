import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        // Una clase abstracta no puede ser instanciada.
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica circulo = new Circulo("Circulo");
        circulo.dibujar();
        circulo.calcularArea();
        
        FiguraGeometrica cuadrado = new Cuadrado("Cuadrado");
        cuadrado.dibujar();
        cuadrado.calcularArea();
        
        List<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
        
        figurasGeometricas.add(circulo);
        figurasGeometricas.add(cuadrado);
    }
    
}

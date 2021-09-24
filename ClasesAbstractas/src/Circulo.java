public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando el área de un circulo");
    }
    
}

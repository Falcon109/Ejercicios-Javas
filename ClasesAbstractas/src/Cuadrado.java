public class Cuadrado extends FiguraGeometrica {

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando el área de un cuadrado");
    }

}

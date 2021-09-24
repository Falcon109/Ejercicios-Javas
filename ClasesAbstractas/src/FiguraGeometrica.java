public abstract class FiguraGeometrica {

    protected String tipoFigura;

    public FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();

    public abstract void calcularArea();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }

}

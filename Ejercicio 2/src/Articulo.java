public abstract class Articulo {

    private String referencia;
    private String nombre;
    private double precio;
    protected String tipoArticulo;

    public Articulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void getDescripcion();

    @Override
    public String toString() {
        return "Articulo: " +
                "referencia: " + referencia + '\'' +
                ", nombre: " + nombre + '\'' +
                ", precio: " + precio +
                ", tipoArticulo: " + tipoArticulo;
    }
}

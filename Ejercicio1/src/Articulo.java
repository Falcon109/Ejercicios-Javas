public class Articulo {

    private String referencia;
    private String nombre;
    private int precio;

    public Articulo() {
    }

    public Articulo(String referencia, String nombre, int precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Informacion: " +
                "referencia: " + referencia + '\'' +
                ", nombre: " + nombre + '\'' +
                ", precio:" + precio;
    }
}

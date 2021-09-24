import java.util.Objects;

public class Dvd extends Articulo{

    private int ean;
    private int duracion;
    private Realizador realizador;

    public Dvd(String tipoArticulo, String referencia, String nombre, double precio, int ean, int duracion, Realizador realizador) {
        super(tipoArticulo);
        super.setReferencia(referencia);
        super.setNombre(nombre);
        super.setPrecio(precio);
        this.ean = ean;
        this.duracion = duracion;
        this.realizador = realizador;
    }

    public int getEan() {
        return ean;
    }

    public void setEan(int ean) {
        this.ean = ean;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Realizador getRealizador() {
        return realizador;
    }

    public void setRealizador(Realizador realizador) {
        this.realizador = realizador;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Soy un DvD");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        return ean == dvd.ean &&
                duracion == dvd.duracion &&
                Objects.equals(realizador, dvd.realizador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ean, duracion, realizador);
    }

    @Override
    public String toString() {
        return "Dvd: " +
                "Referencia" + super.getReferencia() +
                ", Nombre: " + super.getNombre() +
                ", Precio: " + super.getPrecio() +
                ", Ean: " + ean +
                ", Duracion: " + duracion + " minutos" +
                ", Realizador: " + realizador;
    }
}

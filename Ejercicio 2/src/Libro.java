import java.util.Objects;

public class Libro extends Articulo{

    private int isbn;
    private int numeroPaguinas;
    private Autor autor;

    public Libro(String tipoArticulo, String referencia, String nombre, double precio, int isbn, int numeroPaguinas, Autor autor) {
        super(tipoArticulo);
        super.setReferencia(referencia);
        super.setNombre(nombre);
        super.setPrecio(precio);
        this.isbn = isbn;
        this.numeroPaguinas = numeroPaguinas;
        this.autor = autor;

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaguinas() {
        return numeroPaguinas;
    }

    public void setNumeroPaguinas(int numeroPaguinas) {
        this.numeroPaguinas = numeroPaguinas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Soy un Libro");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn &&
                numeroPaguinas == libro.numeroPaguinas &&
                Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, numeroPaguinas, autor);
    }

    @Override
    public String toString() {
        return "Libro: " +
                "Referencia" + super.getReferencia() +
                ", Nombre: " + super.getNombre() +
                ", Precio: " + super.getPrecio() +
                ", isbn:" + isbn +
                ", numeroPaguinas:" + numeroPaguinas +
                ", autor: " + autor;
    }
}

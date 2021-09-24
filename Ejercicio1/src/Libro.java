public class Libro extends Articulo{

    private int isbn;
    private int numeroPaginaas;
    private Persona autor;

    public Libro() {
    }

    public Libro(String referencia, String nombre, int precio, int isbn, int numeroPaginaas, Persona autor) {
        super(referencia, nombre, precio);
        this.isbn = isbn;
        this.numeroPaginaas = numeroPaginaas;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginaas() {
        return numeroPaginaas;
    }

    public void setNumeroPaginaas(int numeroPaginaas) {
        this.numeroPaginaas = numeroPaginaas;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: " +
                "referncia: " + super.getReferencia() +
                " ,nombre: " + super.getNombre() +
                " ,precio: " + super.getPrecio() +
                " ,isbn: " + isbn +
                " ,numeroPaginaas: " + numeroPaginaas +
                " ,autor: " + autor + '\'';
    }
}

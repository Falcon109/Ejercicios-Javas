import java.util.Objects;

public class Autor extends Persona{

    private int id;
    private String seudonimo;
    private String generoLiterario;

    public Autor(String tipoPersona,String nombre,String apellido,int edad,int id,String seudonimo,String generoLiterario) {
        super(tipoPersona);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        this.id = id;
        this.seudonimo = seudonimo;
        this.generoLiterario = generoLiterario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Soy Autor");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return id == autor.id &&
                Objects.equals(seudonimo, autor.seudonimo) &&
                Objects.equals(generoLiterario, autor.generoLiterario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seudonimo, generoLiterario);
    }

    @Override
    public String toString() {
        return "Autor: " +
                "Nombre: " + super.getNombre() +
                ", Apellido: " + super.getApellido() +
                ", Edad: " + super.getEdad() +
                ", Id: " + id +
                ", Seudonimo: " + seudonimo + '\'' +
                ", GeneroLiterario: " + generoLiterario;
    }
}

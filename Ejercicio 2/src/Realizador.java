import java.util.Objects;

public class Realizador extends Persona{

    private int id;
    private String seudonimo;
    private String generoMusical;

    public Realizador(String tipoPersona, String nombre, String apellido, int edad, int id, String seudonimo, String generoMusical) {
        super(tipoPersona);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        this.id = id;
        this.seudonimo = seudonimo;
        this.generoMusical = generoMusical;
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

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public void getDescripcion() {
        System.out.println("Soy el Realizador");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Realizador that = (Realizador) o;
        return id == that.id &&
                Objects.equals(seudonimo, that.seudonimo) &&
                Objects.equals(generoMusical, that.generoMusical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seudonimo, generoMusical);
    }

    @Override
    public String toString() {
        return "Realizador: " +
                "Nombre: " + super.getNombre() +
                ", Apellido: " + super.getApellido() +
                ", Edad: " + super.getEdad() +
                ", Id: " + id +
                ", Seudonimo: " + seudonimo + '\'' +
                ", GeneroMusical: " + generoMusical;
    }
}

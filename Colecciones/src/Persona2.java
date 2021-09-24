import java.util.Date;
import java.util.Objects;

public class Persona2 {

    private String nombreAut;
    private String apellidoAut;
    private Date fechaNacimiento;

    public Persona2(){
    }

    public Persona2(String nombreAut, String apellidoAut, Date fechaNacimiento) {
        this.nombreAut = nombreAut;
        this.apellidoAut = apellidoAut;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAut() {
        return nombreAut;
    }

    public void setNombreAut(String nombreAut) {
        this.nombreAut = nombreAut;
    }

    public String getApellidoAut() {
        return apellidoAut;
    }

    public void setApellidoAut(String apellidoAut) {
        this.apellidoAut = apellidoAut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Informacion del Autor: " +
                "Nombre: " + nombreAut + '\'' +
                ", Apellido: " + apellidoAut + '\'' +
                ", Fecha Nacimiento: " + fechaNacimiento + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona2 persona2 = (Persona2) o;
        return nombreAut.equals(persona2.nombreAut) &&
                apellidoAut.equals(persona2.apellidoAut) &&
                fechaNacimiento.equals(persona2.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreAut, apellidoAut, fechaNacimiento);
    }
}

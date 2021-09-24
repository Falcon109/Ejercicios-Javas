public class Persona {

    private String nombreAut;
    private String apellidoAut;
    private String fechaNacimiento;

    public Persona(){
    }

    public Persona(String nombreAut, String apellidoAut, String fechaNacimiento) {
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Informacion del Autor: " +
                "Nombre: " + nombreAut + '\'' +
                ", Apellido: " + apellidoAut + '\'' +
                ", Fecha Nacimiento: " + fechaNacimiento + '\'';
    }
}

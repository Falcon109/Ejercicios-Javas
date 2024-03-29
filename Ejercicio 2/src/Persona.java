public abstract class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    protected String tipoPersona;

    public Persona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void getDescripcion();

    @Override
    public String toString() {
        return "Persona: " +
                "nombre: " + nombre + '\'' +
                ", apellido: " + apellido + '\'' +
                ", edad: " + edad +
                ", tipoPersona:" + tipoPersona;
    }
}

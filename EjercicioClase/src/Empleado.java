public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;

    public Empleado(String tipoPersona,String nombre,char genero, int edad,String direccion, int idEmpleado, double sueldo) {
        super(tipoPersona);
        super.setNombre(nombre);
        super.setGenero(genero);
        super.setEdad(edad);
        super.setDireccion(direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void descripcion() {
        System.out.println("Soy Empleado");
    }

    /*public String getdescripcion() {
        return("Soy Empleado de la compañia");
    }*/

    @Override
    public String toString() {
        return "Empleado{" +
                " Nombre: " + super.getNombre()+
                ", Genero: "+super.getGenero()+
                ", Edad: "+super.getEdad()+
                ", Direccion: "+super.getDireccion()+
                ", idEmpleado: " + idEmpleado +
                ", sueldo: " + sueldo +
                '.';
    }
}

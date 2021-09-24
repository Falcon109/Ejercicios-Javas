import java.util.Date;

public class Cliente extends Persona{

    private int idCliente;
    private Date fechaRegistro;
    private boolean setVip;

    public Cliente(String tipoPersona) {
        super(tipoPersona);
    }

    public Cliente(String tipoPersona,String nombre,char genero, int edad,String direccion, int idCliente, Date fechaRegistro, boolean setVip) {
        super(tipoPersona);
        super.setNombre(nombre);
        super.setGenero(genero);
        super.setEdad(edad);
        super.setDireccion(direccion);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.setVip = setVip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isSetVip() {
        return setVip;
    }

    public void setSetVip(boolean setVip) {
        this.setVip = setVip;
    }

    @Override
    public void descripcion() {
        System.out.println("Soy cliente, y siempre tengo la razon");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                " Nombre: " + super.getNombre()+
                ", Genero: "+super.getGenero()+
                ", Edad: "+super.getEdad()+
                ", Direccion: "+super.getDireccion()+
                ", idCliente: " + idCliente +
                ", fechaRegistro: " + fechaRegistro +
                ", setVip: " + setVip +
                '.';
    }
}

public class DvD extends Articulo{

    private int duracion;
    private String realizaador;

    Persona realizador =new Persona();

    public DvD() {
    }

    public DvD(String referencia, String nombre, int precio, int duracion, String realizaador) {
        super(referencia, nombre, precio);
        this.duracion = duracion;
        this.realizaador = realizaador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRealizaador() {
        return realizaador;
    }

    public void setRealizaador(String realizaador) {
        this.realizaador = realizaador;
    }
    @Override
    public String toString() {
        return "DvD: " +
                "referncia: " + super.getReferencia() +
                " ,nombre: " + super.getNombre() +
                " ,precio: " + super.getPrecio() +
                " ,Duracion: " + duracion + " minutos" +
                " ,realizador: " + realizaador + '\'' ;
    }

}

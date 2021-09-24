public interface AccesoDatos {

    //por defectos public static final, pero no es necesario escribirlo
    int MAX_REGISTROS = 10;

    //los metodos siempre son abstract, pero no es necesario escribirlo
    public void insertar();

    public void listar();
}

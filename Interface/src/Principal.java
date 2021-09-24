public class Principal {

    public static void main(String[] args) {
        //una interface no puede ser instanciada (es abstracta).
        //AccesoDatos datos = new AccesoDatos();

        AccesoDatos datos = new implementacionOracle();
        datos.insertar();
        datos.listar();

        AccesoDatos datos1 = new ImplementacionMySQL();
        datos1.insertar();
        datos1.listar();

        System.out.println("Atributos estáticos: "+AccesoDatos.MAX_REGISTROS);
    }
}

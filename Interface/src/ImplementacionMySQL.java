public class ImplementacionMySQL implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }
}

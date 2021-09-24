public class implementacionOracle implements AccesoDatos{

    public String atributosaludo = "hola";

    public void whoami(){
        System.out.println("Soy Oracle RDBMS");
    }

    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    public void listar() {
        System.out.println("Listar desde Oracle");
    }
}

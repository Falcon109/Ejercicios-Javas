import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
    public static void main(String[] args) throws ParseException {

        Date fechaRegistro;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        fechaRegistro = format.parse("1998-05-06");

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Juan",'M',24,"14 sur y 25 poniente",0111001101,250.000);
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("Claudia",'F',41,"25 norte y 10 poniente",1211551,fechaRegistro,true);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Benjamin",'M',21,"16 poniente y 1 sur");

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(persona1);
        System.out.println(persona2);
    }
}

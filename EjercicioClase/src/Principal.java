import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws ParseException {


        Date fechaRegistro;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        fechaRegistro = format.parse("1998-05-06");

        Persona Empleado1 = new Empleado("Empleado","Fatima",'F',26,"26 sur 1459",14552645,2500000);
        Persona Cliente1 = new Cliente("Cliente","Maria",'F',20,"4 norte 451612",48551326,fechaRegistro,true);
        System.out.println("Tipo Persona: "+Empleado1.tipoPersona);
        System.out.println("Datos del Empleado: "+Empleado1);
        //System.out.println("Descripcion: "+Empleado1.getdescripcion();
        System.out.println("Tipo Persona: "+Cliente1.tipoPersona);
        System.out.println("Cliente: "+Cliente1);

        List<Persona> Personas = new ArrayList<>();
        Personas.add(Empleado1);
        Personas.add(Cliente1);

        Iterator iterator = Personas.iterator();
        while (iterator.hasNext()){
            Persona p = (Persona) iterator.next();
            System.out.println("Persona: "+p);
        }

    }
}

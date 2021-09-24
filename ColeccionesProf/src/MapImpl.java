import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MapImpl {

    private Date fechaNacimiento1;
    private Date fechaNacimiento2;
    private Date fechaNacimiento3;
    private Date fechaNacimiento4;

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public MapImpl() {
        try {
            fechaNacimiento1 = format.parse("1976-02-07");
            fechaNacimiento2 = format.parse("1996-12-26");
            fechaNacimiento3 = format.parse("1997-06-23");
            fechaNacimiento4 = format.parse("2002-02-12");
        } catch (ParseException ex) {
            Logger.getLogger(MapImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void implementar() {
        // HashMap implementa concepto de par clave, valor.
        Map<String, Persona> personas = new java.util.HashMap<>();

        Persona p1 = new Persona("Espindola", "Jerman", fechaNacimiento1);
        Persona p2 = new Persona("Tapia", "Nicol", fechaNacimiento2);
        Persona p3 = new Persona("Caceres", "Sergio", fechaNacimiento3);
        Persona p4 = new Persona("Espindola", "Camila", fechaNacimiento4);

        // En este caso la clave es el atributo apellido y el valor asociado es la fecha de nacimiento.
        personas.put("11111111-1", p1);
        personas.put("22222222-2", p2);
        personas.put("33333333-3", p3);
        personas.put("44444444-4", p4);

        // Recorrer HashMap con Iterator.
        System.out.println("Recorrer HashMap con Iterator");
        Iterator iterator = personas.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry p = (Map.Entry) iterator.next();
            System.out.println("Clave: " + p.getKey() + " ; " + "Valor: " + p.getValue());
        }

        // Buscar una persona
        String rut = "22222222-2";
        if (personas.containsKey(rut)) {
            System.out.println("Persona encontrada: " + personas.get(rut));

        } else {
            System.out.println("Persona no existe");
        }

        // Eliminar una persona
        if (personas.containsKey(rut)) {
            personas.remove(rut);
            
            Iterator iterator2 = personas.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry p = (Map.Entry) iterator2.next();
                System.out.println("Clave: " + p.getKey() + " ; " + "Valor: " + p.getValue());
            }

        } else {
            System.out.println("Persona no existe");
        }
    }

}

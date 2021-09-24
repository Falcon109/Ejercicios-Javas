import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreeSetImpl {

    private Date fechaNacimiento;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public TreeSetImpl() {
        try {
            fechaNacimiento = format.parse("1976-02-07");
        } catch (ParseException ex) {
            Logger.getLogger(TreeSetImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void implementar() {
        // Implementación TreeSet.
        Set<Persona> personas = new java.util.TreeSet<>();

        personas.add(new Persona("Espindola", "Jerman", fechaNacimiento));
        personas.add(new Persona("Tapia", "Nicol", fechaNacimiento));
        personas.add(new Persona("Caceres", "Sergio", fechaNacimiento));
        personas.add(new Persona("Espindola", "Camila", fechaNacimiento));

        // Número de elementos TreeSet.
        System.out.println("Nº Personas: " + personas.size());

        // Recorrer TreeSet con Iterator.
        System.out.println("Recorrer TreeSet con Iterator");
        Iterator iterator = personas.iterator();

        while (iterator.hasNext()) {
            Persona p = (Persona) iterator.next();
            System.out.println("Persona: " + p);
        }

        // Recorrer TreeSet con For Each.
        System.out.println("Recorrer TreeSet con For Each");
        personas.forEach(
                (p) -> {
                    System.out.println("Persona: " + p);
                }
        );

    }

}

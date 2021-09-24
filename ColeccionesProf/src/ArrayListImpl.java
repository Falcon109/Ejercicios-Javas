import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListImpl {

    private Date fechaNacimiento;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public ArrayListImpl() {
        try {
            fechaNacimiento = format.parse("1976-02-07");
        } catch (ParseException ex) {
            Logger.getLogger(ArrayListImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void implementar() {
        // Implementación ArrayListImpl.
        List<Persona> personas = new java.util.ArrayList<>();

        personas.add(new Persona("Espindola", "Jerman", fechaNacimiento));
        personas.add(new Persona("Tapia", "Nicol", fechaNacimiento));
        personas.add(new Persona("Caceres", "Sergio", fechaNacimiento));
        personas.add(new Persona("Espindola", "Jerman", fechaNacimiento));

        // Número de elementos ArrayListImpl
        System.out.println("Nº Personas: " + personas.size());

        // Recorrer arraylist con Iterator.
        System.out.println("Recorrer arraylist con Iterator");
        Iterator iterator = personas.iterator();

        while (iterator.hasNext()) {
            Persona p = (Persona) iterator.next();
            System.out.println("Persona: " + p);
        }

        // Recorrer arraylist con For Each.
        System.out.println("Recorrer arraylist con For Each");
        personas.forEach(
                (p) -> {
                    System.out.println("Persona: " + p);
                }
        );

        // Verificamos la igualdad. Previa implementación de métodos hashCode() y equals().
        Persona n1 = new Persona("Tapia", "Nicol", fechaNacimiento);
        Persona n2 = new Persona("Tapia", "Nicol", fechaNacimiento);

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        boolean b = (n1.equals(n2));
        System.out.println("n1 y n2 son ¿iguales?: " + b);

        // Búsqueda
        Persona p = new Persona("Tapia", "Nicol", fechaNacimiento);
        int indice = personas.indexOf(p);

        if (indice != -1) {
            System.out.println("Resultado búsqueda: " + personas.get(indice));
        } else {
            System.out.println("Persona no existe");
        }

        // Eliminar elemento de arraylist.
        // Eliminación directa con paso de objeto: personas.remove(Object o)
        boolean ep = personas.remove(p);
        
        if (ep) {
            System.out.println("Persona eliminada");
        
        } else {
            System.out.println("No se encontró elemento");
        }
        
        // Eliminación con paso de índice, obtenido a través de búsqueda previa: personas.remove(int index)
        //personas.remove(indice);

        // Recorrer arraylist con For Each.System.out.println("Recorrer arraylist con For Each");
        personas.forEach(
                (p2) -> {
                    System.out.println("Persona: " + p2);
                }
        );
    }

}

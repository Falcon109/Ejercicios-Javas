import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) throws ParseException {

        Date fechaNacimiento;
        List<Persona2> Personas = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat(("yyyy-MM-dd"));
        fechaNacimiento = format.parse("2050-04-09");

        /*Persona2 p1 = new Persona2("Ariel","Fuentes",fechaNacimiento);
        Persona2 p2 = new Persona2("Juan","Hola",fechaNacimiento);
        Persona2 p3 = new Persona2("Claudio","Adios",fechaNacimiento);*/

        //otra forma de agregar informacion a la ArrayList
        Personas.add(new Persona2("Ariel","Fuentes",fechaNacimiento));
        Personas.add(new Persona2("Juan","Hola",fechaNacimiento));
        Personas.add(new Persona2("Claudio","Adios",fechaNacimiento));

        /*
        Personas.add(p1);
        Personas.add(p2);
        Personas.add(p3);*/

        //numeros de elementos en la ArrayList
        System.out.println("N° de Personas: "+ Personas.size());

        for (Persona2 p : Personas) {
            System.out.println("Persona: "+p);
        } /*forma1*/

        /*
        Iterator it = Personas.iterator();
        while (it.hasNext()){
            Persona2 p = (Persona2) it.next();
            System.out.println("Persona: "+p);
        }
        /*forma2*/

        /*Personas.forEach(p) -> {
            System.out.println("personas: "+p)};

        /*
        System.out.println("Persona1: "+p1);
        System.out.println("Persona2: "+p2);
        System.out.println("Persona3: "+p3);
        */

        //busquedad
        Persona2 p = new Persona2("Ariel","Fuentes",fechaNacimiento);
        int indice = Personas.indexOf(p);

        if (indice != -1){
            System.out.println("resultado búsquedad: "+ Personas.get(indice));
        }else {
            System.out.println("Persona no existe");
        }

        Persona2 n1 = new Persona2("Debora","hola",fechaNacimiento);
        Persona2 n2 = new Persona2("Debora","hola",fechaNacimiento);

        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);

        boolean b =(n1.equals(n2)) ? true: false;

        System.out.println("¿Iguales?: "+b);

        //Eliminar elemento de arraylis
        //Personas.remove(Object o)
        /*
        boolean ep = Personas.remove(p);
        if (ep) {
            System.out.println("Persona eliminada");
        }else{
            System.out.println("NO se encontro elemento");
        }
        for (Persona2 p1 : Personas) {
            System.out.println("Persona: "+p1);
        }
        */

        //Personas.remove(int index)
        Personas.remove(indice);
        for (Persona2 p1 : Personas) {
            System.out.println("Persona: "+p1);
        }

    }
}

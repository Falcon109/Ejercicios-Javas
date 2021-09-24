import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //aqui le estoy dando valores a las variales
        //a los autores
        Autor autor1 = new Autor("Autor","Juan","Gomez",41,745484558,"El gerrero","Ficción");
        Autor autor2 = new Autor("Autor","Claudio","Lopez", 27, 458747815,"kirukato","Ficción");
        //a los realizadores
        Realizador realizador1 = new Realizador("Realizador","Alexis","Alberio",37,474912354,"Alex Zurdo","rap cristiano, reggae y fusión urbano, pop");
        Realizador realizador2 = new Realizador("Realizador","Willy","González",47,794545134,"Redimi2","Hip Hop, Rap, Cristiano");
        //a los libros
        Libro libro1 = new Libro("Libro","La espada negra","La espada Maldita",41587,798542146,407,autor1);
        Libro libro2 = new Libro("Libro","La Guerra Eterna","Mundo de Caos",12000,457981135,648,autor2);
        //a los DvD
        Dvd dvd1 = new Dvd("DvD","De la A a la Z","Asi son las cosas",2500,482561751,95,realizador1);
        Dvd dvd2 = new Dvd("DvD","El exterminador", "Pura sal",2700, 479851656,75,realizador2);

        //aqui agrego las variables a una a la listas
        List<Persona> Personas = new ArrayList<>();
        Personas.add(autor1);
        Personas.add(autor2);
        Personas.add(realizador1);
        Personas.add(realizador2);

        List<Articulo> Articulos = new ArrayList<>();
        Articulos.add(libro1);
        Articulos.add(libro2);
        Articulos.add(dvd1);
        Articulos.add(dvd2);

        //aqui recorro la listas imprimiendo a la vez el contenido de la lista
        for (Persona p : Personas) {
            System.out.println(p);
        }
        System.out.println();

        for (Articulo p : Articulos) {
            System.out.println(p);
        }

        System.out.println();

        //Ahora realizaremos una busquedad (o por lo menos el intento)
        Libro Busq1 = new Libro("Libro","La espada negra","La espada Maldita",41587,798542146,407,autor1);
        int indice1  = Articulos.indexOf(Busq1);
        if (indice1 != -1) {
            System.out.println("Resultado búsqueda: " + Articulos.get(indice1));
        } else {
            System.out.println("Persona no existe");
        }
        System.out.println();
        Dvd Busq2 = new Dvd("DvD","De la A a la Z","Asi son las cosas",2500,482561751,95,realizador1);
        int indice2  = Articulos.indexOf(Busq2);
        if (indice2 != -1) {
            System.out.println("Resultado búsqueda: " + Articulos.get(indice2));
        } else {
            System.out.println("Persona no existe");
        }
    }
}

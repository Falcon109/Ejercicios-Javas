public class Principal {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo();
        Persona persona1 = new Persona();

        Articulo articulo2 = new Articulo("Mando de Juego","Joystick PS3",15000);


        Persona autor1;
        autor1 = new Persona("Marta S.","Pina","06/01/1964");
        Libro libro1 = new Libro("Futurista", "Ctrl Alt Escape", 12000, 965415475,463,autor1);
        /*Persona persona2 = new Persona("Marta S.","Pina","06/01/1964");*/

        DvD dvd1 = new DvD("optimus prime","Transformers",5000,90,"Michael");
        Persona persona3 = new Persona("Michael","Bay","17/02/1965");


        System.out.println("precio articulo 1: "+articulo1.getPrecio());
        System.out.println("precio articulo 2: "+articulo2.getPrecio());
        System.out.println("informacion persona:" + persona1);

        System.out.println("artuculo 1 :"+articulo1);
        System.out.println("artuculo 2 :"+articulo2);
        System.out.println("Libro1: "+libro1);
        System.out.println("DvD1:"+dvd1+" Persona: "+persona3);
        /*aqui hago un pequeño comentario para decirle que intente el agrgar la clase Persona a libro y DvD,
        pero no pude y entonces le di valores directamente para no dejar vacio esos valores.
        y intente unirlos de una manera "creativa" o mas vien para que esten juntos*/
    }
}

import java.util.Scanner;
public class Scaner {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in); //creo un objeto llamado entrada para guardar cosas en varibles
        String nombre; //defino una variable
        String apellido;
        System.out.println("ingrese el nombre:"); //el ln es para dar un salto de linea
        nombre=Entrada.next(); //le doy a la varible nombre el valor ingresado
        System.out.print("ingrese el apellido:");
        apellido=Entrada.next();
        System.out.println("El nombre ingresado es: "+nombre+" , y el apellido es: "+apellido);
        System.out.println("El nombre en Mayusculas seria: "+nombre.toUpperCase());
        System.out.println("El apellido en Minuscula seria:"+apellido.toLowerCase());
        // el .toUpperCase() sirve para poder colocar las letras del nombre en MAYUSCULAS y .toLowerCase() sirve para transformarla a minuscula
        System.out.println("ahora escribiremos partes del nombre: "+nombre.substring(2)); //este es distinto al de abajo, en este se escribe el numero desde donde se quiere que empiece a escribir
        System.out.println("ahora escribiremos partes del nombre: "+nombre.substring(0,3));
        System.out.println("ahora escribiremos partes del nombre: "+nombre.substring(3,5));
        // en estos dos ultimos casos funciona haci *al arecer (desde donde quiere empezar *tambien se escribe, hasta donde quieres que escriba pero con uno mas)
        // *si quieres escribir "casa" hasta la "s" tiene que ser haci (0,4)
        //*al parecer

    }
}

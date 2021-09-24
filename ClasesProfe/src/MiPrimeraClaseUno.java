import java.util.Scanner;

public class MiPrimeraClaseUno {

    static Scanner scanner = new Scanner(System.in);
    
    // Crear un objeto (instanciar) de la clase OperacionMatematica.
    static OperacionMatematica om = new OperacionMatematica();

    public static void main(String[] args) {
        int opcion;
        Integer numeros[];
        int resultado;

        while (true) {
            limpiarConsola();

            System.out.println("Opción 1: Sumar");
            System.out.println("Opción 2: Multiplicar");
            System.out.println("Opción 3: Restar");
            System.out.println("Opción 4: Dividir");
            System.out.println("Opción 5: Salir");
            System.out.println("");

            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();

            if (opcion == 5) {
                break;
            }

            switch (opcion) {
                case 1:
                    // Pedir al usuario que ingrese dos números.
                    numeros = pedirNumeros();

                    // Invocar al método sumar() y pasarle como parámetro los dos números ingresados por el usuario.
                    resultado = om.sumar(numeros[0], numeros[1]);

                    // Mostrar por pantalla el sResultado devuelto por el método sumar().
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:                    
                    // Pedir al usuario que ingrese dos números.
                    numeros = pedirNumeros();

                    // Invocar al método sumar() y pasarle como parámetro los dos números ingresados por el usuario.
                    resultado = om.multiplicar(numeros[0], numeros[1]);

                    // Mostrar por pantalla el sResultado devuelto por el método sumar().
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 3:
                    // Pedir al usuario que ingrese dos números.
                    numeros = pedirNumeros();

                    // Invocar al método sumar() y pasarle como parámetro los dos números ingresados por el usuario.
                    resultado = om.restar(numeros[0], numeros[1]);

                    // Mostrar por pantalla el sResultado devuelto por el método sumar().
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 4:
                    // Pedir al usuario que ingrese dos números.
                    numeros = pedirNumeros();

                    // Invocar al método sumar() y pasarle como parámetro los dos números ingresados por el usuario.
                    resultado = om.dividir(numeros[0], numeros[1]);

                    // Mostrar por pantalla el sResultado devuelto por el método sumar().
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
            }
        }
        System.exit(0);
    }

    public static Integer[] pedirNumeros() {
        Integer numeros[] = new Integer[2];

        System.out.print("Ingrese primer número: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Ingrese segundo número: ");
        numeros[1] = scanner.nextInt();

        return numeros;
    }

    public static void limpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
    }

}

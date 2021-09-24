import java.util.Scanner;

public class MiPrimeraClase {

    static int opcion;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
                    // Invocar al método sumar() y pasarle como parámetro los dos números ingresados por el usuario.
                    // Mostrar por pantalla el resultado devuelto por el método sumar().
                    System.out.println("Ha seleccionado la opción Suma");
                    int sNum1;
                    int sNum2;
                    System.out.println("ingrese un numero:");
                    sNum1=scanner.nextInt();
                    System.out.println("ingrese un numero:");
                    sNum2=scanner.nextInt();
                    int sresultado = sumar(sNum1, sNum2);
                    System.out.println("el resultado es "+sresultado);
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción Multiplicar");
                    int mNum1;
                    int mNum2;
                    System.out.println("ingrese un numero:");
                    mNum1=scanner.nextInt();
                    System.out.println("ingrese un numero:");
                    mNum2=scanner.nextInt();
                    int mresultado = multipli(mNum1, mNum2);
                    System.out.println("el resultado es "+mresultado);
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción Restar");
                    int rNum1;
                    int rNum2;
                    System.out.println("ingrese un numero:");
                    rNum1=scanner.nextInt();
                    System.out.println("ingrese un numero:");
                    rNum2=scanner.nextInt();
                    int rresultado = resta(rNum1, rNum2);
                    System.out.println("el resultado es "+rresultado);
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción Dividir");
                    int dNum1;
                    int dNum2;
                    System.out.println("ingrese un numero:");
                    dNum1=scanner.nextInt();
                    System.out.println("ingrese un numero:");
                    dNum2=scanner.nextInt();
                    int dresultado = divicion(dNum1, dNum2);
                    System.out.println("el resultado es "+dresultado);
                    break;
            }
        }

    }

    public static int sumar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
    }
    public static int multipli(int numero1, int numero2) {
        int resultado;
        resultado = numero1*numero2;
        return resultado;
    }
    public static int resta(int numero1, int numero2) {
        int resultado;
        resultado = numero1-numero2;
        return resultado;
    }
    public static int divicion(int numero1, int numero2) {
        int resultado;
        resultado = (numero1/numero2);
        return resultado;
    }
}

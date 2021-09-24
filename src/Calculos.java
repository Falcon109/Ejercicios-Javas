import java.util.Scanner;

public class Calculos {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int Num1;
        int Num2;
        int suma;
        int resta;
        int multiplicacion;
        float divicion;
        System.out.print("Ingrese un numero:");
        Num1 = Scanner.nextInt();
        System.out.print("Ingrese un numero:");
        Num2 = Scanner.nextInt();
        suma=Num1+Num2;
        resta=Num1-Num2;
        multiplicacion=Num1*Num2;
        divicion=(Num1/Num2);
        System.out.println("Con los numeros que ingreso: "+Num1+" y "+Num2+" se a podido sacar la suma:"+suma+", la resta:"+resta+", la multiplicacion:"+multiplicacion+" y la divion:"+divicion);

    }
}

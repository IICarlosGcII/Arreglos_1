import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10]; //Arreglo de 10 naturalmente
        int posicion, numero; //variable para la posicion y numero

        System.out.println("Guardando datos del arreglo...");
        for(int i=0 ; i<10 ; i++){ //Se declara los datos como 8 espacios parar poder introducir los datos sin desaparecer ningun numero ya ingresado
            System.out.println("Digite los ocho numeros del arreglo...");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Inserte un numero: ");
        numero = entrada.nextInt();
        System.out.println("Inserte una posicion: ");
        posicion = entrada.nextInt();

        //Insertando numero nuevo en la posicion requerida
        for(int i=7 ; i>=posicion ; i--){ //a,a+1,a+2,a+3...
            arreglo[i+1] = arreglo[i];
        }
        arreglo[posicion] = numero;

        System.out.println("El arreglo final es: ");
        for(int i=0 ; i<10 ; i++){
            System.out.println(+arreglo[i]);


        }
    }
}
/*    7. Hacer un programa que:
    1. Cree un array unidimensional de 30 elementos de tipo numérico entero y nombre ”números”
    2. Inicializar el array con valores +, - y nulos
    3. Contabilizar el número de valores +,- y nulos
    4. Mostrar en pantalla los resultados obtenidos*/
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //creacion de datos
        int numeros [] = new int[30];
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;

        //carga de datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce varios numeros" + i);
            numeros[i] = read.nextInt();
            if(numeros[i]==0){
                nulos ++;
            }
            if (numeros[i]<0){
                negativos++;
            }
            if (numeros[i]>0){
                positivos++;
            }
        }

        //visualizacion a la pantalla
            System.out.print("Positivos " + positivos + "|" + "Negativos" + negativos + "|" + "Neutros" + nulos );
    }
}

import java.util.Vector;
//    2. Hacer un programa en el que dado el siguiente array de nombre origen:
//    1. Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares y mayores de 25
//    2. Muestre en pantalla el contenido de los dos arrays unidimensionales
public class Ej2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int origen[] = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 25 && origen[i] % 2 == 0) {
                contador++;
            }
        }
        //nuevo array de destino que nos crea nuevo array y guarda nuevos numeros
        int destino[] = new int[contador];
        for (int i = 0, j=0; i < origen.length; i++) {
            if (origen[i] > 25 && origen[i] % 2 == 0) {
                destino[j] = origen[i];
                j++;
            }
        }
        //imprimimos los dos arrays de
        for (int i = 0; i < origen.length; i++) { // origen
            System.out.print(origen[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < destino.length; i++) { // destino
            System.out.print(destino[i]+" ");
        }
    }
}




/*    4. Hacer un programa que:
    1. Cree un array bidimensional de 10x10
    2. Inicialice la matriz de forma que las filas pares se rellenen a uno y las impares a cero
    3. Una vez inicializada la matriz, muestre su contenido en pantalla*/
public class Ej4 {
    public static void main(String[] args) {
        int arrays [][] = new int[10][10];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                if(i%2==0){
                    arrays[i][j]= 1;
                } else
                    arrays[i][j] = 0;
            }
        }
        //mostramos en la pantalla
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                System.out.print(arrays[i][j] + " ");// imprimir a la pantalla correcto //!!!!!! NO sout "LN"
            }
            System.out.println();
        }
    }
}

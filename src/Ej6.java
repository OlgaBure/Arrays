/* 6. Hacer un programa que:
    1. Cree un array bidimensional de 10x5 y nombre “datos”
    2. Inicialice la matriz de forma que cada elemento guarde el número de fila(ROW) a la que pertenece
    3. Muestre el contenido del array en pantalla*/
public class Ej6 {
    public static void main(String[] args) {
        //creacion de datos
        int datos [][] = new int[10][5];

        //carga de datos
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                datos[i][j]=i;
                }
            }
        // SALIDA A LA PANTALLA
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos [i][j] + " ");
            }
            System.out.println();
        }
    }
}

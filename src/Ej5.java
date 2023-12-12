/* 5. Hacer un programa que:
    1. Cree un array bidimensional de 5x5 y nombre “diagonal”
    2. Inicialice la matriz de forma que los componentes pertenecientes a la diagonal de la matriz valgan 1 y el resto 0
    3. Muestre el contenido del array en pantalla*/
public class Ej5 {
    public static void main(String[] args) {
        //creacion de matriz
        int matriz [][] = new int[5][5];
        //carga de datos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { //columnas, en este caso valdria de limite poner matriz.length
                //(porque tiene el mismo tamaño)
                if(i==j)
                    matriz[i][j]=1;
            }
        }
        //imprimimos los datos a la pantalla
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
}

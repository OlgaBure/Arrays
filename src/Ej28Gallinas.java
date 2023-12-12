import java.util.Random;
/* 28. Queremos almacenar el número de huevos que han puesto 20 gallinas a lo largo de 15 días. Queremos saber:
        A. Media de huevos al día.
         B. Media de huevos por gallina.
        C. Si existe alguna gallina que no nos interesa tener, no es rentable mantener una gallina que no ponga más de tres huevos al día.
        D. Qué gallina ha puesto más huevos el día que introduzcamos por teclado.*/
public class Ej28Gallinas {
    public static void main(String[] args) {
        //inicializacion
        int gallinero [][] = new int[15][20];
        int huevos;
        Random random = new Random();
        for (int i = 0; i < gallinero.length; i++) {
            for (int j = 0; j < gallinero[i].length; j++) {
                gallinero[i][j]=random.nextInt(1,10);
            }

        }
        double suma =0;
        for (int i = 0; i < gallinero.length; i++) {
            for (int j = 0; j < gallinero[i].length; j++) {
                suma+=gallinero[i][j];
            }
        }
        System.out.println(suma/(gallinero.length*gallinero[0].length));
        // salida de datos
        for (int i = 0; i < gallinero.length; i++) {
            for (int j = 0; j < gallinero[i].length; j++) {
                System.out.print(gallinero[i][j]+" ");
             }
            System.out.println(" ");
        }

    }

}

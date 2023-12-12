import java.util.Random;
public class MainOrdenarBoolean {

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //creacion de datos
        int arrays [] = new int[15];
        boolean exit = true;
        Random random = new Random();
        //carga aleatoria
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(15);
        }
        System.out.println("_____________________________");
        //visualizacion a la pantalla
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
        //ordenaicon
        while (exit){
            exit = false;
            for (int j = 0; j < 14; j++) {

                if(arrays[j]>arrays[j+1]){
                    int aux = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1]= aux;
                    exit=true;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
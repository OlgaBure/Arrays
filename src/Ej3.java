import java.util.Random;
/* Hacer un programa que:
    1. Lea una secuencia de 15 números enteros almacenándolos en un array de nombre “números”
    2. Los visualice en el dispositivo estándar de salida en orden inverso al de entrada
    */
public class Ej3 {
    public static void main(String[] args) {
        int numeros [] = new int[15];
        boolean exit=true; // un boolean para poder salir del exercicio facilmente y de manera mas correcta
        Random random = new Random();

        //carga aleatoria
        for (int i = 0; i < numeros.length; i++) {
            //numeros[i]= (int) (Math.random()*11);
            numeros[i] = random.nextInt(15);
        }
        // imprimir a la pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + "-->" + numeros[i]+ "|");
        }
        System.out.println("\n---------------------------------------------------------");
        //imprimimos numeros inversos
        for (int i = 14; i >= 0; i--) {
                System.out.print(i + "-->" + numeros[i]+ "|");
        }
        // ordenacion
        while(exit){
            exit=false;
            for (int i = 0; i < numeros.length-1; i++) {
                if (numeros[i]>numeros[i+1]){
                    int aux=numeros[i];
                    numeros[i]=numeros[i+1];
                    numeros[i+1]=aux;
                    exit=true;
                }
            }
        }
       /* for (int veces = 0; veces < numeros.length; veces++) {
            for (int i = 0; i < numeros.length-1; i++) {
                if(numeros[i]>numeros[i+1]){
                    int aux = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i]= aux;
                }
            }
        }*/
    }
}
